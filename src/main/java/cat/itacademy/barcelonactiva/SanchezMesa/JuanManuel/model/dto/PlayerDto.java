package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {

    private Integer id;
    private String name;
    private String password;
    private LocalDateTime registrationDate;


    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty())? "UNKNOWN" : name;    }
}
