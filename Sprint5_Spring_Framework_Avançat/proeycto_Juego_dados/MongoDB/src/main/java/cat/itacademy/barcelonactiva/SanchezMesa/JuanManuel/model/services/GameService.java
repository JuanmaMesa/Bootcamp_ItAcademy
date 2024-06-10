package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;

import java.util.List;
import java.util.Optional;

public interface GameService {

        GameDiceDto createGame(PlayerEntity playerEntity );
        List<GameDiceDto> getAllGames(PlayerDto playerDto);
        void deleteAllGames(PlayerEntity playerEntity);

}
