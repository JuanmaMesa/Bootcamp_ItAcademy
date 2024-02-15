package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.controllers;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Repeatable;
import java.util.List;
//@RequestMapping("/api/v1/players")
@RestController
public class GameDiceController {
    @Autowired
    private PlayerService service;

    @PostMapping("createPlayer")
    public ResponseEntity<PlayerDto>newPlayer(@RequestBody PlayerDto playerDto){
         PlayerDto playerDto1 = service.addPlayer(playerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(playerDto1);
    }
    @GetMapping("/findAllPlayers")
    public ResponseEntity<List<PlayerDto>> getAllPlayers(){
        List<PlayerDto>playerDtoList = service.getAllPlayers();
        return new ResponseEntity<>(playerDtoList, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String>updatePlayer(@PathVariable("id") Integer id, @RequestBody PlayerDto playerDto){
        service.updatePlayer(id, playerDto);
        return new ResponseEntity<>("Player update succesfully", HttpStatus.OK);
    }
    @PostMapping("/{id}/games")
    public ResponseEntity<GameDiceDto> play(@PathVariable("id") Integer id){
        GameDiceDto newGame = service.playGame(id);
        return new ResponseEntity<>(newGame, HttpStatus.OK);
    }

    @DeleteMapping("/{id}/games")
    public ResponseEntity<PlayerDto> deletePlayer(@PathVariable("id") Integer id){

        return null;
    }
    @GetMapping("/ranking")
    public ResponseEntity<PlayerDto> getRanking(){
        return null;
    }

    @GetMapping("/ranking/loser")
    public ResponseEntity<PlayerDto> getRankingLoser(){
        return null;
    }

    @GetMapping("/ranking/winner")
    public ResponseEntity<PlayerDto> getRankingwinner(){
        return null;
        
    }




}
