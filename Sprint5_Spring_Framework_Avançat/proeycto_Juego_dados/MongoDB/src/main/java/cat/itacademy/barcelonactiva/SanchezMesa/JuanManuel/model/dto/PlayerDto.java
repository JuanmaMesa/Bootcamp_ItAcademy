package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Setter
    private String id;
    private String playerName;
    @Setter
    private LocalDateTime registrationDate;
    @Setter
    private double averageSuccessRate;
    @Setter
    private int gamesPlayed;


    public void setPlayerName(String playerName) {
        this.playerName = (playerName == null || playerName.trim().isEmpty())? "ANONYMOUS" : playerName;    }
}


