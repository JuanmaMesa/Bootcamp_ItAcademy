package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
public interface PlayerService  {
    List<PlayerDto> getAllPlayers();
    PlayerEntity getOnePlayer(Integer id);
    PlayerDto updatePlayer(Integer id, PlayerDto dto);
    PlayerDto createPlayer(PlayerDto dto);
    void deletePlayer(Integer playerID);

    List<PlayerDto>  getWiner();
    List<PlayerDto>  getLoser();


    GameDiceDto playGame(Integer idPlayer);
    List<GameDiceEntity> getAllGamesPlayer(Integer idPlayer);
    void deleteAllGamesPlayer(Integer idPlayer);
    List<PlayerDto> getAllSuccessRate();
    double getAverageSuccessRate(Integer idPlayer);


}
