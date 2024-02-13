package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.exceptions.PlayerNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
                .orElseThrow(()-> new PlayerNotFoundException("Not found player with id: " +id));
    }

    @Override
    public PlayerDto updatePlayer(Integer id, PlayerDto dto) {
        PlayerEntity playerEntity =  repository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID:"+ id));
        playerEntity.setName(dto.getName());
        playerEntity.setPassword(dto.getPassword());
        PlayerEntity updatePlayer = repository.save(playerEntity);

        return PlayerMapper.MAPPER.playerToDto(updatePlayer);
    }

    @Override
    public PlayerDto addPlayer(PlayerDto dto) {
        PlayerEntity playerEntity = PlayerMapper.MAPPER.dtoToPlayerEntity(dto);
       //todo no coincidir nombre
       PlayerEntity savePlayer = repository.save(playerEntity);
        return PlayerMapper.MAPPER.playerToDto(savePlayer);
    }

    @Override
    public void deletePlayer(Integer id) {
        PlayerEntity existingPlayer = repository.findById(id).
                orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: "+id));
        repository.deleteById(existingPlayer.getPlayerId());
    }

    @Override
    public PlayerDto findById(Integer id) {
        PlayerEntity playerEntity = repository.findById(id)
                .orElseThrow(()-> new PlayerNotFoundException("Player Not found with ID: " + id));

        return PlayerMapper.MAPPER.playerToDto(playerEntity);
    }

    @Override
    public PlayerDto findByName(String name) {
        // Todo busqueda por nombre
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
