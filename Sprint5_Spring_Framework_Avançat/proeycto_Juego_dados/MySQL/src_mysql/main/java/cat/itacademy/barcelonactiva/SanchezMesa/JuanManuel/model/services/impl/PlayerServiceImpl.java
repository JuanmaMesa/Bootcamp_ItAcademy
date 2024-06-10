package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerAlreadyExistException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private GameService gameService;

    @Override
<<<<<<< HEAD
    public PlayerDto createPlayer(PlayerDto playerDto) {
        if(playerDto.getPlayerName()== null || playerDto.getPlayerName().trim().isEmpty()){
            playerDto.setPlayerName("ANONYMOUS");
        }

        List<PlayerEntity> existingPlayer = playerRepository.findByPlayerNameIgnoreCase(playerDto.getPlayerName());
        if(!existingPlayer.isEmpty() && !playerDto.getPlayerName().equalsIgnoreCase("ANONYMOUS")){
            throw new PlayerAlreadyExistException("oops the player name is  already taken. ");

        }
        PlayerEntity playerEntity1 = PlayerMapper.MAPPER.dtoToPlayerEntity(playerDto);
        playerEntity1 = playerRepository.save(playerEntity1);

        return PlayerMapper.MAPPER.playerToDto(playerEntity1);
    }
    @Override
    public PlayerDto getDtoPlayer(String id) {
=======
    public PlayerDto createPlayer(PlayerDto dto) {
        if(dto.getPlayerName()== null || dto.getPlayerName().trim().isEmpty()){
            dto.setPlayerName("ANONYMOUS");
        }

        List<PlayerEntity> existingPlayer = playerRepository.findByPlayerNameIgnoreCase(dto.getPlayerName());
        if(!existingPlayer.isEmpty() && !dto.getPlayerName().equalsIgnoreCase("ANONYMOUS")){
            throw new PlayerAlreadyExistException("oops the player name is  already taken. ");

        }
        PlayerEntity playerEntity1 = PlayerMapper.MAPPER.dtoToPlayerEntity(dto);
        playerEntity1 = playerRepository.save(playerEntity1);

        return PlayerMapper.MAPPER.playerToDto(playerEntity1);

        }
    @Override
    public PlayerDto getDtoPlayer(Integer id) {
>>>>>>> repo5/master
        PlayerEntity playerEntity = getOnePlayer(id);
        PlayerDto playerDto = PlayerMapper.MAPPER.playerToDto(playerEntity);

        int totalGamesPlayed = playerEntity.getGames().size();
        playerDto.setGamesPlayed(totalGamesPlayed);

<<<<<<< HEAD
        double averageSuccssRate = getAverageSuccessRate(playerEntity.getId());
=======
        double averageSuccssRate = getAverageSuccessRate(playerEntity.getPlayerID());
>>>>>>> repo5/master
        playerDto.setAverageSuccessRate(averageSuccssRate);

        return playerDto;

    }


<<<<<<< HEAD
    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerEntity> players = (List<PlayerEntity>) playerRepository.findAll();
=======

    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerEntity> players = playerRepository.findAll();
>>>>>>> repo5/master

        return players.stream().map(player -> {
            PlayerDto playerDto = PlayerMapper.MAPPER.playerToDto(player);

            int totalGamesPlayed = player.getGames().size();
            playerDto.setGamesPlayed(totalGamesPlayed);

<<<<<<< HEAD
            double averageSuccessRate = getAverageSuccessRate(player.getId());
=======
            double averageSuccessRate = getAverageSuccessRate(player.getPlayerID());
>>>>>>> repo5/master
            playerDto.setAverageSuccessRate(averageSuccessRate);

            return playerDto;

        }).toList();
    }

<<<<<<< HEAD
    public double getAverageSuccessRate(String idPlayer) {
=======
    public double getAverageSuccessRate(Integer idPlayer) {
>>>>>>> repo5/master
        List<GameDiceEntity> allGames = getAllGamesPlayer(idPlayer);
        if (allGames.isEmpty()) return 0.0;

        double winRate = (double) allGames.stream()
                .filter(GameDiceEntity::isWin)
                .count() / allGames.size() * 100;

        winRate = Math.round(winRate * 100.0) / 100.0;
        return winRate;

    }

    @Override
<<<<<<< HEAD
    public PlayerEntity getOnePlayer(String id) {
=======
    public PlayerEntity getOnePlayer(Integer id) {
>>>>>>> repo5/master
        return playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Not found player with id: " + id));
    }

<<<<<<< HEAD
    @Override
    public PlayerDto updatePlayer(String id, PlayerDto dto) {
=======

    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto dto) {
>>>>>>> repo5/master
        PlayerEntity playerEntity = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Player Not found with ID:" + id));

        if (!playerEntity.getPlayerName().equalsIgnoreCase(dto.getPlayerName())) { // conflictos con su propio nombre
            List<PlayerEntity> existingPlayer = playerRepository.findByPlayerNameIgnoreCase(dto.getPlayerName());
<<<<<<< HEAD
            if (!existingPlayer.isEmpty() && !dto.getPlayerName().equalsIgnoreCase("ANONYMOUS")) {
=======
            if (!existingPlayer.isEmpty() && !dto.getPlayerName().equalsIgnoreCase("ANONYMOUS") ) {
>>>>>>> repo5/master
                throw new PlayerAlreadyExistException("Oops, the player name is already taken.");
            }
        }
        playerEntity.setPlayerName(dto.getPlayerName());
        PlayerEntity updatePlayer = playerRepository.save(playerEntity);

        return PlayerMapper.MAPPER.playerToDto(updatePlayer);
    }

    @Override
<<<<<<< HEAD
    public void deletePlayer(String idPlayer) {
        PlayerEntity existingPlayer = playerRepository.findById(idPlayer).
                orElseThrow(() -> new PlayerNotFoundException("Player Not found with ID: " + idPlayer));
        playerRepository.deleteById(existingPlayer.getId());
=======
    public void deletePlayer(Integer idPlayer) {
        PlayerEntity existingPlayer = playerRepository.findById(idPlayer).
                orElseThrow(() -> new PlayerNotFoundException("Player Not found with ID: " + idPlayer));
        playerRepository.deleteById(existingPlayer.getPlayerID());
>>>>>>> repo5/master
    }


    @Override
<<<<<<< HEAD
    public List<GameDiceEntity> getAllGamesPlayer(String idPlayer) {
=======
    public List<GameDiceEntity> getAllGamesPlayer(Integer idPlayer) {
>>>>>>> repo5/master
        PlayerEntity playerEntity = getOnePlayer(idPlayer);
        return playerEntity.getGames();
    }

    @Override
<<<<<<< HEAD
    public GameDiceDto playGame(String idPlayer) {
=======
    public GameDiceDto playGame(Integer idPlayer) {
>>>>>>> repo5/master
        PlayerEntity player = getOnePlayer(idPlayer);

        return gameService.createGame(player);
    }

    @Override
<<<<<<< HEAD
    public void deleteAllGamesPlayer(String idPlayer) {
=======
    public void deleteAllGamesPlayer(Integer idPlayer) {
>>>>>>> repo5/master
        PlayerEntity existingPlayer = playerRepository.findById(idPlayer).
                orElseThrow(() -> new PlayerNotFoundException("Player Not found with ID: " + idPlayer));

        gameService.deleteAllGames(existingPlayer);

    }

<<<<<<< HEAD
    public int numberGamesPlayed(String playerId) {
=======
    public int numberGamesPlayed(Integer playerId) {
>>>>>>> repo5/master
        PlayerEntity player = playerRepository.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException("Player Not found with ID: " + playerId));
        return player.getGames().size();
    }

    @Override
    public List<PlayerDto> getWiner() {

        double maxSuccessAverage = getAllSuccessRate().stream()
                .max(Comparator.comparing(PlayerDto::getAverageSuccessRate))
                .map(PlayerDto::getAverageSuccessRate)
                .orElseThrow(NoSuchElementException::new);


        return getAllSuccessRate().stream()
                .filter(player -> player.getAverageSuccessRate() == maxSuccessAverage)
                .toList();
    }

    @Override
    public List<PlayerDto> getLoser() {

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

<<<<<<< HEAD
=======

>>>>>>> repo5/master
}
