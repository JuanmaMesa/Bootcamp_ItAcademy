package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceMApper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.mechanics.RandomDice;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
     @Autowired
     private PlayerRepository repository;
     @Autowired
     private GameDiceRepository gameDiceRepository;

     @Autowired
     private GameService gameService;

    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerEntity> players = repository.findAll();
        return players.stream().map(PlayerMapper.MAPPER::playerToDto)
                .collect(Collectors.toList());
    }
    @Override
    public PlayerEntity getOnePlayer(Integer id) {
        return repository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Not found player with id: " +id));
    }
    @Override
    public PlayerDto createPlayer(PlayerDto dto) {
        PlayerEntity playerEntity = PlayerMapper.MAPPER.dtoToPlayerEntity(dto);
        playerEntity  = repository.save(playerEntity);
        return PlayerMapper.MAPPER.playerToDto(playerEntity);
    }
    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto dto) {
        PlayerEntity playerEntity =  repository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID:"+ id));
        playerEntity.setName(dto.getName());
        playerEntity.setPassword(dto.getPassword());
        PlayerEntity updatePlayer = repository.save(playerEntity);

        return PlayerMapper.MAPPER.playerToDto(updatePlayer);
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
            PlayerEntity existingPlayer = repository.findById(idPlayer).
                    orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: "+idPlayer));
            repository.deleteById(existingPlayer.getPlayerID());

    }


    @Override
    public PlayerDto findById(Integer id) {
        PlayerEntity playerEntity = repository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: " + id));

        return PlayerMapper.MAPPER.playerToDto(playerEntity);
    }


    @Override
    public PlayerDto getWiner() {
        return null;
    }

    @Override
    public PlayerDto getLoser() {
        return null;
    }

    @Override
    public List<PlayerDto> getAllSuccessRate() {
        return null;
    }

    @Override
    public double getAverageSuccessRate(Integer idPlayer) {
        List<GameDiceEntity> allGames = getAllGamesPlayer(idPlayer);
        long totalGames = allGames.size();
        long gamesWin = allGames.stream()
                .filter(GameDiceEntity::isWin)
                .count();
        return totalGames > 0 ? ((double) gamesWin / totalGames) *100:0;
    }


}
