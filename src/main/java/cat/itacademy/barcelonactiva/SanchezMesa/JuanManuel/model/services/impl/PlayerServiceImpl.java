package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerAlreadyExistException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService, UserDetailsService {
     @Autowired
     private PlayerRepository playerRepository;
     @Autowired
     private GameDiceRepository gameDiceRepository;
     @Autowired
     private GameService gameService;

    @Override
    public PlayerDto createPlayer(PlayerDto dto) {
        Optional<PlayerEntity> existintPlayer = playerRepository.findByNameIgnoreCase(dto.getName());

        if(existintPlayer.isPresent()){
            throw new PlayerAlreadyExistException("oops the player name is  already taken. ");
        }
        PlayerEntity playerEntity = PlayerMapper.MAPPER.dtoToPlayerEntity(dto);
        playerEntity  = playerRepository.save(playerEntity);
        return PlayerMapper.MAPPER.playerToDto(playerEntity);
    }

    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerEntity> players = playerRepository.findAll();

        return players.stream().map(player->{
           PlayerDto playerDto = PlayerMapper.MAPPER.playerToDto(player);

           int totalGamesPlayed = player.getGames().size();
           playerDto.setGamesPlayed(totalGamesPlayed);

           double averageSuccessRate = getAverageSuccessRate(player.getPlayerID());
           playerDto.setAverageSuccessRate(averageSuccessRate);

           return playerDto;

        }).toList();
    }

    public double getAverageSuccessRate(Integer idPlayer) {
        List<GameDiceEntity> allGames = getAllGamesPlayer(idPlayer);
        if(allGames.isEmpty()) return 0.0;

        double winRate = (double) allGames.stream()
                .filter(GameDiceEntity::isWin)
                .count() / allGames.size() *100;

        winRate = Math.round(winRate *100.0)/100.0;
        return winRate;

    }



    @Override
    public PlayerEntity getOnePlayer(Integer id) {
        return playerRepository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Not found player with id: " +id));
    }
    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto dto) {
        PlayerEntity playerEntity =  playerRepository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID:"+ id));

        if(!playerEntity.getName().equalsIgnoreCase(dto.getName())){ // conflictos con su propio nombre
            Optional<PlayerEntity> existingPlayer = playerRepository.findByNameIgnoreCase(dto.getName());
                if(existingPlayer.isPresent()){
                    throw new PlayerAlreadyExistException("Oops, the player name is already taken.");
                }
        }
        playerEntity.setName(dto.getName());
        playerEntity.setPassword(dto.getPassword());
        PlayerEntity updatePlayer = playerRepository.save(playerEntity);

        return PlayerMapper.MAPPER.playerToDto(updatePlayer);
    }
    @Override
    public void deletePlayer(Integer idPlayer) {
        PlayerEntity existingPlayer = playerRepository.findById(idPlayer).
                orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: "+idPlayer));
        playerRepository.deleteById(existingPlayer.getPlayerID());
    }
    @Override
    public List<GameDiceEntity> getAllGamesPlayer(Integer idPlayer) {
        PlayerEntity playerEntity = getOnePlayer(idPlayer);
        return playerEntity.getGames();
    }

    @Override
    public GameDiceDto playGame(Integer idPlayer) {
        PlayerEntity player = getOnePlayer(idPlayer);

        return gameService.createGame(player);
    }

    @Override
    public void deleteAllGamesPlayer(Integer idPlayer) {
            PlayerEntity existingPlayer = playerRepository.findById(idPlayer).
                    orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: "+idPlayer));

            gameService.deleteAllGames(existingPlayer);

    }
    public int numberGamesPlayed (Integer playerId){
        PlayerEntity player = playerRepository.findById(playerId)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: "+playerId));
        return player.getGames().size();
    }

    @Override
    public List<PlayerDto>  getWiner() {

        double maxSuccessAverage = getAllSuccessRate().stream()
                .max(Comparator.comparing(PlayerDto::getAverageSuccessRate))
                .map(PlayerDto::getAverageSuccessRate)
                .orElseThrow(NoSuchElementException::new);



        return getAllSuccessRate().stream()
                .filter(player -> player.getAverageSuccessRate() == maxSuccessAverage)
                .toList();
    }

    @Override
    public List<PlayerDto>  getLoser() {

        double minSuccessAverage = getAllSuccessRate().stream()
                .min(Comparator.comparing(PlayerDto::getAverageSuccessRate))
                .map(PlayerDto::getAverageSuccessRate)
                .orElseThrow(NoSuchElementException::new);

        return getAllSuccessRate().stream()
                .filter(player -> player.getAverageSuccessRate() == minSuccessAverage)
                .toList();
    }

    @Override
    public List<PlayerDto> getAllSuccessRate() {
        List<PlayerDto> playersDtoList = getAllPlayers();
        /*playersDtoList.forEach( player ->{
            double averageSuccessRate = getAverageSuccessRate(player.getPlayerID());
            player.setAverageSuccessRate(averageSuccessRate);
                });*/

        return playersDtoList.stream()
                .sorted(Comparator.comparing(PlayerDto::getAverageSuccessRate).reversed())
                .collect(Collectors.toList());
    }


    @Override
    public UserDetailsService userDetailsService() {
        return username -> {
            PlayerEntity player = playerRepository.findByNameIgnoreCase(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Player not found with username: " + username));
            return new org.springframework.security.core.userdetails.User(player.getName(), player.getPassword(), Collections.emptyList());
        };
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        PlayerEntity player = playerRepository.findByNameIgnoreCase(username)
                .orElseThrow(() -> new UsernameNotFoundException("Player not found with username: " + username));
        return new org.springframework.security.core.userdetails.User(player.getName(), player.getPassword(), new ArrayList<>());
    }
}

