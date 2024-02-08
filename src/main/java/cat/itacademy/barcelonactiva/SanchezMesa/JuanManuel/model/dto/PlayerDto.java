package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import java.time.LocalDateTime;

public class PlayerDto {
    public PlayerDto() {
    }

    private Integer id;
    private String name;

    private int score;
    private LocalDateTime localDateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty())? "UNKNOWN" : name;    }
}
