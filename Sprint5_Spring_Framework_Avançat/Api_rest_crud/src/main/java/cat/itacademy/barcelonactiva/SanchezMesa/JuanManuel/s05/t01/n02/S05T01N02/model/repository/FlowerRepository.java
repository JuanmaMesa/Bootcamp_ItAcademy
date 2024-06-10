package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<FlowerEntity, Integer> {

}
