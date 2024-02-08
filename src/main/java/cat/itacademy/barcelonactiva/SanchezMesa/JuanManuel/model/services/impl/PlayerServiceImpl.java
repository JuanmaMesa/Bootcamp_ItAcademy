package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
     @Autowired
     private PlayerRepository repository;
    @Override
    public List<PlayerDto> getAllPlayers() {
        List<PlayerEntity> players = repository.findAll();
        return players.stream().map(PlayerMapper.MAPPER::playerToDto)
                .collect(Collectors.toList());
    }

    @Override
    public PlayerEntity getOnePlayer(Integer id) {
        return repository.findById(id)
                .orElseThrow();
        //TODO poner excepcion
    }

    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto dto) {
        return null;
    }

    @Override
    public PlayerDto addPlayer(PlayerDto dto) {
        PlayerEntity playerEntity = PlayerMapper.MAPPER.dtoToPlayerEntity(dto);
       PlayerEntity savePlayer = repository.save(playerEntity);
        return PlayerMapper.MAPPER.playerToDto(savePlayer);
    }

    @Override
    public void deletePlayer(Integer id) {
    //Todo eliminar
    }

    @Override
    public PlayerDto findById(Integer id) {
        PlayerEntity playerEntity = repository.findById(id)
        .orElseThrow();
        //TODO poner excepcion
        return PlayerMapper.MAPPER.playerToDto(playerEntity);
    }
}
