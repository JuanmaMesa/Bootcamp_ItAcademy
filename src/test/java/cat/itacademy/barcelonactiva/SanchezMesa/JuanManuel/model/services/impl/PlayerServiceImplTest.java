package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.GameDiceRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;



@ExtendWith(MockitoExtension.class)
class PlayerServiceImplTest {

    @Mock
    private PlayerRepository playerRepository;
    @Mock
    private GameServiceImpl gameService;

    @InjectMocks
    private PlayerServiceImpl playerService;


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
        //playerEntityList.add(playerTest2);

        // Simular el efecto de la eliminación en playerEntityList
        Mockito.doAnswer(invocation -> {
            String id = invocation.getArgument(0);
            playerEntityList.removeIf(player -> player.getId().equals(id));
            return null; // Representa la eliminación
        }).when(playerRepository).deleteById("abc1");


    }

    @Test
    void getOnePlayerTest() {
        Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));

        PlayerEntity result = playerService.getOnePlayer("abc1");

        Assertions.assertEquals("John", result.getPlayerName(), "el nombre deberia ser john");
        Assertions.assertNotNull(result);
    }


    @Test
    void getAllGamesPlayerTest() {

        Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));

        List<GameDiceEntity> expectedListGames = new ArrayList<>();
        expectedListGames.add(gametest1);
        expectedListGames.add(gametest2);

        List<?> resultList = playerService.getAllGamesPlayer("abc1");
        Assertions.assertTrue(new ReflectionEquals(expectedListGames).matches(resultList));

    }

    @Test
    void deletePlayerTest() {
        Mockito.when(playerRepository.findById("abc1")).thenReturn((Optional.of(playerTest1)));

        Assertions.assertTrue(playerEntityList.contains(playerTest1));
        playerService.deletePlayer("abc1");
        Assertions.assertFalse(playerEntityList.contains(playerTest1));

        Mockito.verify(playerRepository).deleteById("abc1");
        Assertions.assertTrue(playerEntityList.isEmpty(), "la lista deberia estar vacia");
    }

    @Test
    void deleteAllGamesPlayerTest() {
        Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));

        playerService.deleteAllGamesPlayer("abc1");

        Mockito.verify(playerRepository).findById("abc1");
        Mockito.verify(gameService).deleteAllGames(playerTest1);


    }

    @Test
    void createPlayer() {
    }

    @Test
    void getDtoPlayer() {
    }

    @Test
    void getAllPlayers() {
    }

    @Test
    void getAverageSuccessRate() {
    }

    @Test
    void updatePlayer() {
    }

    @Test
    void playGame() {
    }

    @Test
    void numberGamesPlayed() {
    }

    @Test
    void getWiner() {
    }

    @Test
    void getLoser() {
    }

    @Test
    void getAllSuccessRate() {
    }
}