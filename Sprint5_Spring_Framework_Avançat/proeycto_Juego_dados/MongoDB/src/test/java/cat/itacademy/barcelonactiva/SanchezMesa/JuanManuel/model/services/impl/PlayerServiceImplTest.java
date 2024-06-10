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

import java.time.LocalDateTime;
import java.util.*;

import static org.hamcrest.Matchers.*;


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
    private PlayerDto playerDtoTest1;
    private PlayerDto playerDTOTest2;
    private List<PlayerEntity> playerEntityList;
    private List<PlayerDto>playersDtoList;


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

        PlayerDto playerDtoTest1 = new PlayerDto();
        playerDtoTest1.setId("abc1");
        playerDtoTest1.setPlayerName("John");
        playerDtoTest1.setRegistrationDate(LocalDateTime.of(2024, 2, 24, 17, 30));
        playerDtoTest1.setAverageSuccessRate(75.5);
        playerDtoTest1.setGamesPlayed(20);




        gametest1.setPlayer(playerTest1);
        gametest2.setPlayer(playerTest1);

        playerEntityList = new ArrayList<>();
        playerEntityList.add(playerTest1);
        //playerEntityList.add(playerTest2);

        playersDtoList = new ArrayList<>();
        playersDtoList.add(playerDtoTest1);



        // Simular el efecto de la eliminación en playerEntityList
       /* Mockito.doAnswer(invocation -> {
            String id = invocation.getArgument(0);
            playerEntityList.removeIf(player -> player.getId().equals(id));
            return null; // Representa la eliminación
        }).when(playerRepository).deleteById("abc1");*/


    }

    @Test
    void getOnePlayerTest() {
        Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));

        PlayerEntity result = playerService.getOnePlayer("abc1");

        Assertions.assertEquals("John", result.getPlayerName(), "el nombre deberia ser john");
        Assertions.assertNotNull(result);
    }

    @Test
    void getAllPlayersTest() {
    Mockito.when(playerRepository.findAll()).thenReturn(playerEntityList);
    Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));

    List<PlayerDto> resultLst = playerService.getAllPlayers();

    //Assertions.assertTrue(new ReflectionEquals(playersDtoList).matches(resultLst),"lista de playersDto");
    Assertions.assertEquals(resultLst.size(),playersDtoList.size());


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
    void createPlayerTest_WhenNameIsProvided() {
    // configuracion inicial
     PlayerDto newPlayerDto = new PlayerDto();
     PlayerDto newPlayerDtoEmpty = new PlayerDto();
     newPlayerDto.setPlayerName("John");
     newPlayerDtoEmpty.setPlayerName("");

    Mockito.when(playerRepository.findByPlayerNameIgnoreCase("John")).thenReturn(Collections.emptyList());

    PlayerDto resultGood = playerService.createPlayer(newPlayerDto);

    Assertions.assertNull(resultGood, "El resultado debe ser null");
    Mockito.verify(playerRepository).save(Mockito.isA(PlayerEntity.class));

    }

    @Test
    void createPlayerTest_WhenNameIsEmpty() {
        // configuracion inicial

        PlayerDto newPlayerDtoEmpty = new PlayerDto();
        newPlayerDtoEmpty.setPlayerName("");

        List<PlayerEntity> playerAnonymousList = new ArrayList<>();
        PlayerEntity anonymousPlayer = new PlayerEntity();
        anonymousPlayer.setPlayerName("ANONYMOUS");
        playerAnonymousList.add(anonymousPlayer);

        //comportamiento esperado del mock

        Mockito.when(playerRepository.findByPlayerNameIgnoreCase("ANONYMOUS")).thenReturn(playerAnonymousList);

        playerService.createPlayer(newPlayerDtoEmpty);

        Assertions.assertEquals("ANONYMOUS", newPlayerDtoEmpty.getPlayerName(), " El nombre del juagador debe ser ANONYMOUS");

    }

    @Test
    void getDtoPlayer() {
    }


    @Test
    void getAverageSuccessRate() {
    }

    @Test
    void updatePlayer() {
    }

    @Test
    void playGame() {
        PlayerEntity playerTest1 = new PlayerEntity("John");
        playerTest1.setId("abc1");
        Mockito.when(playerRepository.findById("abc1")).thenReturn(Optional.of(playerTest1));
        playerService.playGame("abc1");

        Mockito.verify(gameService).createGame(playerTest1);


    }

    @Test
    void numberGamesPlayed() {
    }

    @Test
    void getWiner() {
        PlayerDto player1 = new PlayerDto();
        player1.setAverageSuccessRate(0);
        PlayerDto player2 = new PlayerDto();
        player2.setAverageSuccessRate(100);
        player2.setPlayerName("Yo");

        List<PlayerDto> allplayers = new ArrayList<>(Arrays.asList(player1,player2));

        Mockito.when(playerService.getAllSuccessRate()).thenReturn(allplayers);

        List<PlayerDto>winners = playerService.getWiner();

        //Assertions.assertEquals(1, winners.size(), "deberia haber un ganador");
        Assertions.assertEquals(player2.getPlayerName(), winners.get(0).getPlayerName());





    }
    @Test
    void getWiner2() {
        PlayerDto playerDto1 = new PlayerDto();
        playerDto1.setAverageSuccessRate(0);
        PlayerDto playerDto2 = new PlayerDto();
        playerDto2.setAverageSuccessRate(100);
        playerDto2.setPlayerName("Yo");
        List<PlayerDto> allPlayers = Arrays.asList(playerDto1, playerDto2);

        // Configura el comportamiento esperado de getAllSuccessRate para devolver allPlayers
        Mockito.when(playerService.getAllSuccessRate()).thenReturn(allPlayers);

        // Ejecuta getWiner
        List<PlayerDto> winners = playerService.getWiner();

        // Verifica que la lista de ganadores contenga solo a playerDto2
        Assertions.assertEquals(1, winners.size(), "Debería haber un ganador");
        Assertions.assertEquals("Yo", winners.getFirst().getPlayerName(), "El ganador debería ser 'Yo'");
    }


    @Test
    void getLoser() {
    }

    @Test
    void getAllSuccessRate() {
    }
}