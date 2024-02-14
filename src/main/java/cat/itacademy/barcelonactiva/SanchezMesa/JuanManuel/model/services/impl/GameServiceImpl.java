package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.mechanics.RandomDice;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameServices {
    @Autowired
    GameDiceRepository repository;

    public GameDiceDto addGame(PlayerEntity playerEntity){
        repository.save(game)
        GameDiceDto gameDiceDto = newGame();
        repository.save(playerEntity,);
        repository.save(); //gameDTOToEntity(playerEntity, gameDTO));
        return null;
    }
    private GameDiceDto newGame(){
        return new GameDiceDto((byte) RandomDice.newRandomDice(),(byte)RandomDice.newRandomDice());
    }

}
