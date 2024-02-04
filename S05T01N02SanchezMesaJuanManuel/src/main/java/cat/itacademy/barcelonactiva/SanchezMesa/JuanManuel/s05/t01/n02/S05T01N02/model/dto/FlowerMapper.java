package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
@Mapper
public interface FlowerMapper {
    FlowerMapper MAPPER = Mappers.getMapper(FlowerMapper.class);

    FlowerDto flowerToDto(FlowerEntity flowerEntity);

    FlowerEntity dtoToFlower(FlowerDto flowerDto);

    @AfterMapping
    default void setFlowerType(@MappingTarget FlowerDto dto, FlowerEntity flowerEntity){
        dto.setFlowerType(dto.getCountryFlower());
    }
}


