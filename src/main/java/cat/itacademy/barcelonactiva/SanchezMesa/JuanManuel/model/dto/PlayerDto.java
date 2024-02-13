package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;

import java.time.LocalDateTime;

public class PlayerDto {
    public PlayerDto() {
    }

    private Integer id;
    private String name;
    private String password;
    private LocalDateTime registrationDate;

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    private int score;
    //private String password;
    private LocalDateTime localDateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty())? "UNKNOWN" : name;    }
}
