package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameDiceMApper {
    GameDiceMApper MAPPER = Mappers.getMapper(GameDiceMApper.class);

    GameDiceDto gameDiceToDto(GameDiceEntity gameDiceEntity);


    GameDiceEntity dtoGameDice(GameDiceDto gameDiceDto);


}
