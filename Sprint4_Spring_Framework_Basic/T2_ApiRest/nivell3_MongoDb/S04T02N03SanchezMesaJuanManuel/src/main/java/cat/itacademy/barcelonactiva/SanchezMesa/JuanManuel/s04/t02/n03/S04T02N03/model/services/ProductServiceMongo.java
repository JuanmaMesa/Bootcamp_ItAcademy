package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.domain.Product;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceMongo implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public Optional<Product> findById(String id) {
        return repository.findById( id);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Optional<Product> delete(String id) {
        Optional<Product> productdb = repository.findById(id);
        productdb.ifPresent((product -> {
            repository.delete(product);
        }));

        return productdb;
    }

    @Override
    public Optional<Product> update(String id, Product product) {
        Optional<Product> productOptional = repository.findById(id);
        if (productOptional.isPresent()) {
            Product productDb = productOptional.orElseThrow();

            productDb.setName(product.getName());
            productDb.setNumberKg(product.getNumberKg());

            return Optional.of(repository.save(productDb));

        }
        return productOptional;
    }


}
