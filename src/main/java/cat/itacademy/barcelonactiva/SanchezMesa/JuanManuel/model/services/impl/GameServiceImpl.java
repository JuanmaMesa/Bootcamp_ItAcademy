package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceMApper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.mechanics.RandomDice;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameServices {
    @Autowired
    GameDiceRepository repository;

    public GameDiceDto addGame(GameDiceDto gameDiceDto){
        gameDiceDto = newGame();
        GameDiceEntity gameDiceEntity = GameDiceMApper.MAPPER.dtoGameDice(gameDiceDto);
        GameDiceEntity gameDiceEntity1 = repository.save(gameDiceEntity);
        return GameDiceMApper.MAPPER.gameDiceToDto(gameDiceEntity1);
    }
    private GameDiceDto newGame(){
        return new GameDiceDto((byte) RandomDice.newRandomDice(),(byte)RandomDice.newRandomDice());
    }

}

