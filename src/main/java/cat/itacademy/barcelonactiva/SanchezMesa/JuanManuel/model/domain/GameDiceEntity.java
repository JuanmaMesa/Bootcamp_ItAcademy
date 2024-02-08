package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Game-Dice")
public class GameDiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dice1")
    private int dice1;

    @Column(name = "dice12")
    private int dice2;

    //TODO  hacer timestamp ( a que hora se jugo la partida)






}
