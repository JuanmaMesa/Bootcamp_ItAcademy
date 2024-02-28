package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceMApper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.mechanics.RandomDice;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameDiceRepository gameDiceRepository;

    @Autowired
    private PlayerRepository playerRepository;
    @Override
    public GameDiceDto createGame(PlayerEntity player) {
        GameDiceEntity newGame = new GameDiceEntity();

        newGame.setPlayer(player);
        newGame.setDice1((byte) RandomDice.newRandomDice());
        newGame.setDice2((byte) RandomDice.newRandomDice());
        newGame.setWin(newGame.getDice1()+ newGame.getDice2()== newGame.getWinValue());
        newGame = gameDiceRepository.save(newGame);
        return GameDiceMApper.MAPPER.gameDiceToDto(newGame);
    }

    @Override
    public List<GameDiceDto> getAllGames(PlayerDto playerDto) {
        List<GameDiceEntity> gameDiceEntityList = gameDiceRepository.findAll();
        List<GameDiceDto> gameDiceDtoList = new ArrayList<>();

        gameDiceEntityList.stream()
                .toList().forEach(game -> gameDiceDtoList.add(GameDiceMApper.MAPPER.gameDiceToDto(game)));

        return gameDiceDtoList;
    }

    @Override
    public void deleteAllGames(PlayerEntity playerEntity) {
        List<GameDiceEntity> allGames = playerEntity.getGames();
        if(allGames != null && !allGames.isEmpty()) {
            gameDiceRepository.deleteAll();
           
        }
    }
}

