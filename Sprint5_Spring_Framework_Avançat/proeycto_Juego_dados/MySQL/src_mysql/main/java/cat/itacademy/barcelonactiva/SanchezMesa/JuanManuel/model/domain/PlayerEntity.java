package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.PrePersist;
import org.springframework.data.annotation.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Document(collection = "players")
public class PlayerEntity {

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("playerName")
    private String playerName;

    @Setter
    @JsonProperty("registrationDate")
    private LocalDateTime registrationDate;

    @JsonProperty("games")
    @DBRef
    private List<GameDiceEntity> games = new ArrayList<>();

    public PlayerEntity(String playerName) {
        this.playerName = playerName;
        this.registrationDate = LocalDateTime.now();
    }
    public PlayerEntity(){
        this.registrationDate = LocalDateTime.now();
    }


    @PrePersist
    public void prePersist() {
        if (this.registrationDate == null) {
            this.registrationDate = LocalDateTime.now();
        }
    }




}

=======

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

    @Column(name = "playerName", length = 50)
    private String playerName;


    @Column(name = "registration_date")
    private LocalDateTime registrationDate;


    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<GameDiceEntity> games;


    @PrePersist
    protected void onCreate() {
        registrationDate = LocalDateTime.now();
    }

}


>>>>>>> repo5/master
