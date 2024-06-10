package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "gamedice")
public class GameDiceEntity {
    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("dice1")
    private byte dice1;

    @JsonProperty("dice2")
    private byte dice2;

    @JsonProperty("win")
    private boolean win;

    @JsonIgnoreProperties({"games"})
    private PlayerEntity player;

    @Transient
    private static final byte WINVALUE = 7;

    public static byte getWinValue() {
        return WINVALUE;
    }
=======
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "GameDice")
public class GameDiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dice1")
    private byte dice1;

    @Column(name = "dice2")
    private byte dice2;

    @Column(name = "win")
    private boolean win;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playerID")
    private PlayerEntity player;

    @Transient
    private final byte winValue = 7;
>>>>>>> repo5/master

    public GameDiceEntity(PlayerEntity player, byte dice1, byte dice2){
        this.player = player;
        this.dice1 = dice1;
        this.dice2 = dice2;



    }







}
