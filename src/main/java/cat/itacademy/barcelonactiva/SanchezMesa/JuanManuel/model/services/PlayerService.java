package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;

import java.util.List;
public interface PlayerService  {
    public List<PlayerDto> getAllPlayers();

    public PlayerEntity getOnePlayer(Integer id);

    public PlayerDto updatePlayer(Integer id, PlayerDto dto);

    public PlayerDto createPlayer(PlayerDto dto);
    public List<GameDiceEntity> getAllGamesPlayer(Integer idPlayer);

    public void deleteAllGamesPlayer(Integer idPlayer);

    public PlayerDto findById(Integer id);



    public GameDiceDto playGame(Integer idPlayer);
    public  PlayerDto getWiner();
    public PlayerDto getLoser();
    List<PlayerDto> getAllSuccessRate();
    double getAverageSuccessRate(Integer idPlayer);
}
