package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class GameServiceImplTest {
    @Mock
    private GameDiceRepository gameDiceRepository;

    @InjectMocks
    private GameServiceImpl gameService;


    private PlayerEntity playerTest1;
    private PlayerEntity playerTest2;
    private GameDiceEntity gametest1;
    private GameDiceEntity gametest2;
    private GameDiceEntity gametest3;
    private PlayerDto playerDTOTest1;
    private PlayerDto playerDTOTest2;
    private List<PlayerEntity> playerEntityList;


    @BeforeEach
    void setUp() {
        // new games
        gametest1 = new GameDiceEntity(null, (byte) 6, (byte) 1);
        gametest2 = new GameDiceEntity(null, (byte) 3, (byte) 2);
        gametest3 = new GameDiceEntity(null, (byte) 1, (byte) 2);


        // new players
        playerTest1 = new PlayerEntity("John");
        playerTest1.setId("abc1");
        playerTest1.getGames().add(gametest1);
        playerTest1.getGames().add(gametest2);



        gametest1.setPlayer(playerTest1);
        gametest2.setPlayer(playerTest1);

        playerEntityList = new ArrayList<>();
        playerEntityList.add(playerTest1);



    }
    @Test
    void deleteAllGamesTest() {
        List<GameDiceEntity> gamesPlayer = new ArrayList<>(Arrays.asList(gametest1, gametest2));
        playerTest1.setGames(gamesPlayer);

        gameService.deleteAllGames(playerTest1);


        Assertions.assertTrue(playerTest1.getGames().isEmpty(),"deberia estar la lista vacia");



    }
}