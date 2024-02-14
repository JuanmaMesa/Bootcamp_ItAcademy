package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;

import java.util.List;

public interface GameServices {
    interface GameService {
        GameDiceDto addGame(PlayerEntity playerEntity);
        List<GameDiceDto> getAllGames(PlayerEntity playerEntity);
    }

}
