package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "gamedice")
public class GameDiceEntity {
    @Id
    private String id;

    private byte dice1;
    private byte dice2;
    private boolean win;
    private PlayerEntity player;

    @Transient
    private final byte winValue = 7;

    public GameDiceEntity(PlayerEntity player, byte dice1, byte dice2){
        this.player = player;
        this.dice1 = dice1;
        this.dice2 = dice2;



    }







}
