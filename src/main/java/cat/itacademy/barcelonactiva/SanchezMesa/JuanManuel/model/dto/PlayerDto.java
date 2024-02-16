package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {

    private Integer playerID;
    private String name;
    private String password;
    private LocalDateTime registrationDate;
    private double averageSuccessRate;


    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty())? "UNKNOWN" : name;    }
}
