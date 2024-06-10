package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
public interface PlayerService  {
    List<PlayerDto> getAllPlayers();
<<<<<<< HEAD
    PlayerEntity getOnePlayer(String id);
    PlayerDto updatePlayer(String id, PlayerDto dto);
    PlayerDto createPlayer(PlayerDto playerDto);
    void deletePlayer(String playerID);
    PlayerDto getDtoPlayer(String id);

=======
    PlayerEntity getOnePlayer(Integer id);
    PlayerDto updatePlayer(Integer id, PlayerDto dto);
    PlayerDto createPlayer(PlayerDto dto);
    void deletePlayer(Integer playerID);
    PlayerDto getDtoPlayer(Integer id);
>>>>>>> repo5/master

    List<PlayerDto>  getWiner();
    List<PlayerDto>  getLoser();


<<<<<<< HEAD
    GameDiceDto playGame(String idPlayer);
    List<GameDiceEntity> getAllGamesPlayer(String idPlayer);
    void deleteAllGamesPlayer(String idPlayer);
    List<PlayerDto> getAllSuccessRate();
    double getAverageSuccessRate(String idPlayer);
=======
    GameDiceDto playGame(Integer idPlayer);
    List<GameDiceEntity> getAllGamesPlayer(Integer idPlayer);
    void deleteAllGamesPlayer(Integer idPlayer);
    List<PlayerDto> getAllSuccessRate();
    double getAverageSuccessRate(Integer idPlayer);
>>>>>>> repo5/master


}
