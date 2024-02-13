package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "players", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "password", length = 15, nullable = false)
    private String password;

    @Column(name = "score")
    private int score;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;


    public PlayerEntity() {

    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // establecer la fecha automaticamente
    @PrePersist
    protected void onCreate() {
        registrationDate = LocalDateTime.now();
    }

}


