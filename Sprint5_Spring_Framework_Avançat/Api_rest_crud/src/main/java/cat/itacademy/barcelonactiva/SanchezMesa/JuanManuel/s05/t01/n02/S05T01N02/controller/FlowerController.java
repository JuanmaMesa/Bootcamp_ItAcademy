package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.controller;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto.FlowerMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.services.FlowerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Flower", description = "Flower management APIs")
@RestController
//@RequestMapping("/api/v1")
public class FlowerController {
    @Autowired
    private FlowerService service;

    @Operation(
            summary  = "Find all Flowers",
            description = "Find all Flowers. List of all objects with id, name country and the type of Euro or Not Euro Country",
            tags = {"get"}
    )
    @GetMapping("/findAll")
    public List<FlowerDto> flowerEntityList(){
        return service.getAllFlower();
    }
    @Operation(
            summary = "Create a Flower",
            description = "Create a Flower object. The response is a httpStatus showing the result of the operation.",
            tags = {"post"})
    @PostMapping("/add")
    public ResponseEntity<FlowerDto> addFlower(@RequestBody FlowerDto flowerDto){
        FlowerDto newFlowerDto = service.addFlower(flowerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newFlowerDto);
    }

    @Operation(
            summary = "update a Flower by id",
            description = "update a Flower object. The response is a httpStatus showing the result of the operation.",
            tags = {"put"})
    @PutMapping("/update/{id}")
    public ResponseEntity<FlowerDto> uppdateFlower(@PathVariable int id,@RequestBody FlowerDto flowerDto){

        FlowerDto newFlowerDto = service.updateFlower(id,flowerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newFlowerDto);
    }

    @Operation(
            summary = "Delete a Flower by id",
            description = "Delete a Flower object. The response is a httpStatus showing the result of the operation.",
            tags = {"delete"})
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteFlower(@PathVariable int id){
       service.deleteFlower(id);
       return new ResponseEntity<>(("Flower deleted successfully with id: "+id), HttpStatus.OK);
    }

}
