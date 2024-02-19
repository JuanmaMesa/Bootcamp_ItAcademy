package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.time.LocalDateTime;
import java.util.Collection;
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

    @Column(name = "PlayerName", length = 50)
    private String playerName;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;


    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<GameDiceEntity> games;

    public PlayerEntity(String playerName, String password) {
        this.playerName = playerName;
        this.password = password;
    }


    @PrePersist
    protected void onCreate() {
        registrationDate = LocalDateTime.now();
    }

}


