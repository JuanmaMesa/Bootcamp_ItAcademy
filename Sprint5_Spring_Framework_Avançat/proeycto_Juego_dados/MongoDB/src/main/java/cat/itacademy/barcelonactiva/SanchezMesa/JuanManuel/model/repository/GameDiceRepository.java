package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.GameDiceEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GameDiceRepository  extends MongoRepository<GameDiceEntity, String> {
    List<GameDiceEntity> findByPlayer(PlayerEntity player);
}
