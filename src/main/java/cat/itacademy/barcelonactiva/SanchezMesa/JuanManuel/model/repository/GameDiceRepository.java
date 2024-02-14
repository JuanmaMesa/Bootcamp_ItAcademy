package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GameDiceRepository  extends JpaRepository<GameDiceEntity, Integer> {
    List<GameDiceEntity> findByPlayer(PlayerEntity player);
}
