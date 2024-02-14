package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerID;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "password", length = 15, nullable = false)
    private String password;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY, orphanRemoval = true )
    private List<GameDiceEntity> games;

    @PrePersist
    protected void onCreate() {
        registrationDate = LocalDateTime.now();
    }


}


