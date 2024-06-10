package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

<<<<<<< HEAD
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
=======
>>>>>>> repo5/master
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;

public interface GameService {

        GameDiceDto createGame(PlayerEntity playerEntity );
=======

public interface GameService {

        GameDiceDto createGame(PlayerEntity playerEntity);
>>>>>>> repo5/master
        List<GameDiceDto> getAllGames(PlayerDto playerDto);
        void deleteAllGames(PlayerEntity playerEntity);

}
