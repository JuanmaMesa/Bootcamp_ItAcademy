package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.repository;


import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, String> {


    Optional<Product> findById(String id);
}
