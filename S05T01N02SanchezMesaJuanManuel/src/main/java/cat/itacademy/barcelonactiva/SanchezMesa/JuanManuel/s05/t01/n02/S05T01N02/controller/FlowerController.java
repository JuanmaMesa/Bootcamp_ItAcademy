package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.controller;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
public class FlowerController {

    @Autowired
    private FlowerService service;

    @GetMapping("/findAll")
    public List<FlowerDto> flowerEntityList(){
        return service.getAllFlower();
    }

    @PostMapping("/add")
    public ResponseEntity<FlowerDto> addFlower(@RequestBody FlowerDto flowerDto){
        FlowerDto newFlowerDto = service.addFlower(flowerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newFlowerDto);
    }

}
