package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.controllers;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
<<<<<<< HEAD

=======
>>>>>>> repo5/master
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.GameDiceMApper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
<<<<<<< HEAD

=======
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerMapper;
>>>>>>> repo5/master
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.GameService;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RequestMapping("/api/v1/players")
@RestController
public class GameDiceController {
    @Autowired
    private PlayerService playerService;

    @Autowired
    private GameService gameService;

    //  --- Player ---
<<<<<<< HEAD
    @PostMapping("/addplayer")
=======
    @PostMapping("")
>>>>>>> repo5/master
    public ResponseEntity<Map<String, Object>>newPlayer(@RequestBody PlayerDto playerDto){
         PlayerDto playerDto1 = playerService.createPlayer(playerDto);
        Map<String, Object> body = new HashMap<>();
        body.put("Message", "Player created successfully");
        body.put("player", playerDto1);
        return new ResponseEntity<>(body, HttpStatus.CREATED);
    }

<<<<<<< HEAD
    @GetMapping("/getplayer")
=======
    @GetMapping("")
>>>>>>> repo5/master
    public ResponseEntity<List<PlayerDto>> getAllPlayers(){
        List<PlayerDto>playerDtoList = playerService.getAllPlayers();
        return new ResponseEntity<>(playerDtoList, HttpStatus.OK);
    }

    @GetMapping("/one/{id}")
<<<<<<< HEAD
    public ResponseEntity<PlayerDto> getPlayer(@PathVariable("id") String id, @RequestBody PlayerDto playerDto){
=======
    public ResponseEntity<PlayerDto> getPlayer(@PathVariable("id") Integer id, @RequestBody PlayerDto playerDto){
>>>>>>> repo5/master
        PlayerDto playerDto1 = playerService.getDtoPlayer(id);
        return new ResponseEntity<>(playerDto1, HttpStatus.OK);
    }
    @PutMapping("/{id}")
<<<<<<< HEAD
    public ResponseEntity<String>updatePlayer(@PathVariable("id") String id, @RequestBody PlayerDto playerDto){
=======
    public ResponseEntity<String>updatePlayer(@PathVariable("id") Integer id, @RequestBody PlayerDto playerDto){
>>>>>>> repo5/master
        playerService.updatePlayer(id, playerDto);
        return new ResponseEntity<>("Player update successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
<<<<<<< HEAD
    public ResponseEntity<String> deletePlayer(@PathVariable("id") String id){
=======
    public ResponseEntity<String> deletePlayer(@PathVariable("id") Integer id){
>>>>>>> repo5/master
        playerService.deletePlayer(id);
        return new ResponseEntity<>("Player deleted SuccessFully ", HttpStatus.OK);
    }


    // --- Games ---

    @PostMapping("/{id}/games")
<<<<<<< HEAD
    public ResponseEntity<GameDiceDto> play(@PathVariable("id") String id){
=======
    public ResponseEntity<GameDiceDto> play(@PathVariable("id") Integer id){
>>>>>>> repo5/master
        GameDiceDto newGame = playerService.playGame(id);

        return new ResponseEntity<>(newGame,HttpStatus.OK);
    }

    @DeleteMapping("/{id}/games")
<<<<<<< HEAD
    public ResponseEntity<String> deleteAllGamesPlayer(@PathVariable("id") String id){
=======
    public ResponseEntity<String> deleteAllGamesPlayer(@PathVariable("id") Integer id){
>>>>>>> repo5/master
        playerService.deleteAllGamesPlayer(id);
        return new ResponseEntity<>("All games deleted!", HttpStatus.OK);
    }

    @GetMapping("/{id}/games")
<<<<<<< HEAD
    public ResponseEntity<?> getAllGamesPlayer(@PathVariable("id") String id){
=======
    public ResponseEntity<?> getAllGamesPlayer(@PathVariable("id") Integer id){
>>>>>>> repo5/master
        List<GameDiceEntity> gameDiceEntityList = playerService.getAllGamesPlayer(id);
        if( gameDiceEntityList.isEmpty()){
            return new ResponseEntity<>("No Games found for player with ID: " + id, HttpStatus.NOT_FOUND);
        } else {
<<<<<<< HEAD
            List<GameDiceDto> allGames = GameDiceMApper.MAPPER.gameDiceToDtoList(gameDiceEntityList);
=======

            List<GameDiceDto> allGames = GameDiceMApper.MAPPER.gameDiceToDtoList(gameDiceEntityList);

>>>>>>> repo5/master
            return new ResponseEntity<>(allGames, HttpStatus.OK);
        }
    }

    @GetMapping("/ranking")
<<<<<<< HEAD
    public ResponseEntity<Map<String, Object>> getRanking(){
          List<PlayerDto> playersRanking = playerService.getAllSuccessRate();
          Map<String, Object> body = new HashMap<>();
          body.put("message", "Player/1 number One");
          body.put("playersRanking", playersRanking);

            return new ResponseEntity<>(body, HttpStatus.OK);
=======
    public ResponseEntity<List<PlayerDto>> getRanking(){
          List<PlayerDto> PlayersRanking = playerService.getAllSuccessRate();

            return new ResponseEntity<>(PlayersRanking, HttpStatus.OK);
>>>>>>> repo5/master
    }

    @GetMapping("/ranking/loser")
    public ResponseEntity<List<PlayerDto>> getRankingLoser(){
        List<PlayerDto>playerDtolosersList = playerService.getLoser();

        return new ResponseEntity<>(playerDtolosersList, HttpStatus.OK);

    }

    @GetMapping("/ranking/winner")
    public ResponseEntity<List<PlayerDto>> getRankingwinner(){
        List<PlayerDto>playerDtoWinner = playerService.getWiner();

        return new ResponseEntity<>(playerDtoWinner, HttpStatus.OK);
        
    }




}
