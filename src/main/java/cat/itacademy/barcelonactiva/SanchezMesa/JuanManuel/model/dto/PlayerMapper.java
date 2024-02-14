package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerMapper {
    PlayerMapper MAPPER = Mappers.getMapper(PlayerMapper.class);

    //@Mapping(target = "playerId", source = "playerId")
   // @Mapping(source = "registrationDate", target = "registrationDate")
    @Mapping(target = "password", source = "password")
    PlayerDto playerToDto(PlayerEntity playerEntity);

    //@Mapping(target = "playerId", source = "playerId")
    //@Mapping(source = "registrationDate", target = "registrationDate")
    @Mapping(target = "password", source = "password")
    PlayerEntity dtoToPlayerEntity(PlayerDto dto);
}
