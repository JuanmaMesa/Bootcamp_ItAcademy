package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.repository.FlowerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.services.FlowerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class FlowerServiceImpl implements FlowerService {
    @Autowired
    private FlowerRepository repository;
    @Override
    public List<FlowerDto> getAllFlower() {
        List<FlowerEntity> flowers = repository.findAll();

        return flowers.stream().map(FlowerMapper.MAPPER::flowerToDto)
                .collect(Collectors.toList());
    }
    @Override
    public FlowerEntity getOneFlower(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not found flower with id:" +id));
    }

    @Override
    public FlowerDto addFlower(FlowerDto flowerDto) {
        FlowerEntity flowerEntity1 = FlowerMapper.MAPPER.dtoToFlower(flowerDto);
        FlowerEntity savedFlower = repository.save(flowerEntity1);
        return FlowerMapper.MAPPER.flowerToDto((savedFlower));
    }

    @Override
    public FlowerDto updateFlower(Integer id, FlowerDto flowerDto) {
        FlowerEntity flowerEntity = repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Not found wit id: "+id));
        flowerEntity.setNameFlower(flowerDto.getNameFlower());
        flowerEntity.setCountryFlower(flowerDto.getCountryFlower());
        FlowerEntity updateFlower = repository.save(flowerEntity);

        return FlowerMapper.MAPPER.flowerToDto(updateFlower);
    }

    @Override
    public void deleteFlower(Integer id) {
        FlowerEntity flowerTodelete = repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Not found with id: " + id));
        repository.deleteById(flowerTodelete.getPk_FlorID());

    }

    @Override
    public FlowerDto findById(Integer id) {
        FlowerEntity flowerEntity = repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Flower not found with id: "+id));
        return FlowerMapper.MAPPER.flowerToDto(flowerEntity);
    }
}
