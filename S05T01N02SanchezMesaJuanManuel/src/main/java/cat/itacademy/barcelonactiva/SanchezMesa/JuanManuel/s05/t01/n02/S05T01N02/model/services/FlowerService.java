package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerDto;

import java.util.List;

public interface FlowerService {
    public List<FlowerDto> getAllFlower();
    public FlowerEntity getOneFlower(Integer id);
    public FlowerDto addFlower(FlowerDto flowerDto);
    public FlowerDto updateFlower(Integer id , FlowerDto flowerDto);
    public void deleteFlower(Integer id);
    public FlowerDto findById(Integer id);

}
