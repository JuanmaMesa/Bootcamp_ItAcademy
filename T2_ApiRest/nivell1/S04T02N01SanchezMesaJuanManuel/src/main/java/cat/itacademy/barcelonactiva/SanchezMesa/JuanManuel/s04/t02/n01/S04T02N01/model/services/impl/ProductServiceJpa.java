package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.domain.Product;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.exceptions.ProductNotFoundException;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.repository.ProductRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n01.S04T02N01.model.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceJpa implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Product findById(int id)  {
        return repository.findById(id)
                .orElseThrow(() ->new ProductNotFoundException("Producto no encontrado"));

    }

    @Transactional
    @Override
    public Product save(Product product) {
        return repository.save(product);
    }
    @Transactional
    @Override
    public String delete(int id) {
        Product product = repository.findById(id)
                .orElseThrow(()-> new ProductNotFoundException("Producto no encontrado con el id "+id));
                repository.delete(product);
                return "Producto eliminado con exito con el id: "+id;



    }

    @Transactional
    @Override
    public Optional<Product> update(int id, Product product) {
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
