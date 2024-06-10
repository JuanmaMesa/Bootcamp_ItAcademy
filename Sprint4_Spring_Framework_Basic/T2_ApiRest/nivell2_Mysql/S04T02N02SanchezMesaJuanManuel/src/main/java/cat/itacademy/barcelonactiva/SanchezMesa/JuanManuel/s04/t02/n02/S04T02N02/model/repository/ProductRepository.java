package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n02.S04T02N02.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n02.S04T02N02.model.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {


    Optional<Product> findById(int id);
}
