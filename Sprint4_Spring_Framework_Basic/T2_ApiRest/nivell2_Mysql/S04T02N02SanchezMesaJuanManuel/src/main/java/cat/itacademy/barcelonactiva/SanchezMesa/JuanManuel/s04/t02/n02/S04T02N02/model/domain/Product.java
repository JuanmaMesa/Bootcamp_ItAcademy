package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n02.S04T02N02.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int numberKg;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberKg() {
        return numberKg;
    }

    public void setNumberKg(int numberKg) {
        this.numberKg = numberKg;
    }
}
