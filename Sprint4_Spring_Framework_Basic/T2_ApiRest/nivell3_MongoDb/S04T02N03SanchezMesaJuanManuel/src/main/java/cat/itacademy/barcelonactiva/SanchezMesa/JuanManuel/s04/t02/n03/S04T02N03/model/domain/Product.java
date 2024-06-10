package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t02.n03.S04T02N03.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="Mercado")

public class Product {
    @Id
    private String id;
    private String name;
    private Integer numberKg;// Integer -> permitimos que sea nul


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
