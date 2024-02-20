package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity,Integer> {
    //Optional<PlayerEntity> findByNameIgnoreCase(String playerName);
    Optional<PlayerEntity> findByPlayerNameIgnoreCase(String playerName);

}
