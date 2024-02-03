package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import org.mapstruct.factory.Mappers;

public interface FlowerMapper {
    FlowerMapper MAPPER = Mappers.getMapper(FlowerMapper.class);

    FlowerDto flowerToDto(FlowerEntity flowerEntity);

    FlowerEntity dtoToFlower(FlowerDto flowerDto);



}
