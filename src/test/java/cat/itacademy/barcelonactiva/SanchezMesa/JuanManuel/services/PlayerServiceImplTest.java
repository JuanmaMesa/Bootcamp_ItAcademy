package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository.PlayerRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.impl.PlayerServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.*;

import org.mockito.Mockito;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {
    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;

    private PlayerEntity playerTest1;
    private PlayerEntity playerTest2;
    private GameDiceEntity gametest1;
    private GameDiceEntity gametest2;

    private PlayerDto playerDTOTest1;
    private PlayerDto playerDTOTest2;

    private List<PlayerEntity> playerList;
    private List<PlayerDto> playerDTOList;

    @BeforeEach
    void setUp() {
        gametest1= new GameDiceEntity();
        gametest1.setDice1((byte)4);
        gametest1.setDice2((byte)1);
        gametest2 = new GameDiceEntity();
        gametest2.setDice1((byte)3);
        gametest2.setDice2((byte)2);

        playerTest1 = new PlayerEntity();
        playerTest1.setPlayerName("yo");
        playerTest1.setPlayerID("0000d");
        playerTest1.getGames().add(gametest1);


        playerTest2 = new PlayerEntity();

        playerDTOTest1 = new PlayerDto();
        playerDTOTest2 = new PlayerDto();


    }

    
    @Test
    void deletePlayerTest() {
        Mockito.when(playerRepository.findById(Integer.valueOf("0000d"))).thenReturn(Optional.ofNullable(playerTest1));

        playerService.deletePlayer("0000d");

        assertTrue(playerTest1.getPlayerID().isEmpty());

}}
