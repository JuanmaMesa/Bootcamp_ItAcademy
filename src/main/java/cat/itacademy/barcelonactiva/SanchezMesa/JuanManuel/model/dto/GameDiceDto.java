package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import jakarta.persistence.Transient;
import lombok.*;

@Getter
@Setter

public class GameDiceDto {
    private Integer id;
    private byte dice1;
    private byte dice2;
    private boolean win;



public  GameDiceDto(byte dice1, byte dice2){
    this.dice1 = dice1;
    this.dice2 = dice2;
    if(dice1 + dice2 == 7){
        this.win = true;
    }else{
        this.win = false;
    }

}
}
