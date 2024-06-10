package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

<<<<<<< HEAD

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDiceDto implements Serializable {
    private String id;
=======
import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.*;

@Getter
@Setter

public class GameDiceDto {
    private Integer id;
>>>>>>> repo5/master
    private byte dice1;
    private byte dice2;
    private boolean isWin;

<<<<<<< HEAD

=======
>>>>>>> repo5/master
    private static final int WINNING_SUM = 7;



<<<<<<< HEAD
public  GameDiceDto(byte dice1, byte dice2){
    this.dice1 = dice1;
    this.dice2 = dice2;
    this.isWin = dice1 + dice2 == WINNING_SUM;
=======

    public  GameDiceDto(byte dice1, byte dice2){
    this.dice1 = dice1;
    this.dice2 = dice2;
        this.isWin = dice1 + dice2 == WINNING_SUM;
>>>>>>> repo5/master

}
    @JsonGetter("isWin")
    public String getWin(){
        return isWin?"Victory":"Defeat";
    }
<<<<<<< HEAD

=======
>>>>>>> repo5/master
}
