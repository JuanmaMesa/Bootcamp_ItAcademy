package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {

    private Integer playerID;
    private String playerName;
    private LocalDateTime registrationDate;
    private double averageSuccessRate;
    private int gamesPlayed;


    public void setPlayerName(String playerName) {
        this.playerName = (playerName == null || playerName.trim().isEmpty())? "UNKNOWN" : playerName;    }
}
