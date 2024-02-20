package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
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
@Document(collection = "players")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playerID;
    private String playerName;
    private LocalDateTime registrationDate;
    private List<GameDiceEntity> games;


    @PrePersist
    protected void onCreate() {
        registrationDate = LocalDateTime.now();
    }

}


