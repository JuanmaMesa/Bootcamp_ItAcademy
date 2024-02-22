package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends MongoRepository<PlayerEntity,String> {
    Optional<PlayerEntity> findByPlayerNameIgnoreCase(String playerName);

}
