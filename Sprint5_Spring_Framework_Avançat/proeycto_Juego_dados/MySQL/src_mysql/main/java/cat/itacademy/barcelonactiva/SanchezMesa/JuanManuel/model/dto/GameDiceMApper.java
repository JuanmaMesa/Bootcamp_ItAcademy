package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GameDiceMApper {
    GameDiceMApper MAPPER = Mappers.getMapper(GameDiceMApper.class);

<<<<<<< HEAD
    @Mapping(target = "id", source = "id")
    GameDiceDto gameDiceToDto(GameDiceEntity gameDiceEntity);
    @Mapping(target = "id", source = "id")
=======
    //@Mapping(target = "id", source = "id")
    GameDiceDto gameDiceToDto(GameDiceEntity gameDiceEntity);
    //@Mapping(target = "id", source = "id")
>>>>>>> repo5/master
    List<GameDiceDto>gameDiceToDtoList(List<GameDiceEntity> gameDiceEntity);

    //@Mapping(target = "id", source = "id")
    GameDiceEntity dtoGameDice(GameDiceDto gameDiceDto);


}
