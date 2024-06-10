package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
<<<<<<< HEAD
import org.springframework.data.mongodb.repository.MongoRepository;

=======
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> repo5/master
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
<<<<<<< HEAD
public interface GameDiceRepository  extends MongoRepository<GameDiceEntity, String> {
=======
public interface GameDiceRepository  extends JpaRepository<GameDiceEntity, Integer> {
>>>>>>> repo5/master
    List<GameDiceEntity> findByPlayer(PlayerEntity player);
}
