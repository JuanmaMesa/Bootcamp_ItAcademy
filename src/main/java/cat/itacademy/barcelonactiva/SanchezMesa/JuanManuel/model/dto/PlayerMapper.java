package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerMapper {
    PlayerMapper MAPPER = Mappers.getMapper(PlayerMapper.class);

   // @Mapping(target = "password", source = "password")
    //@Mapping(source = "registrationDate", target = "registrationDate")
    PlayerDto playerToDto(PlayerEntity playerEntity);

    //@Mapping(target = "password", source = "password")
    //@Mapping(source = "registrationDate", target = "registrationDate")
    PlayerEntity dtoToPlayerEntity(PlayerDto dto);
}
