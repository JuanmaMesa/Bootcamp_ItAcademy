package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Flowers")
public class FlowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_FlorID;
    @Column(name = "name", nullable = false, length = 50)
    private String nameFlower;
    @Column(name = "country", nullable = false, length = 50)
    private String countryFlower;

    public FlowerEntity(Integer pk_FlorID, String nameFlower, String countryFlower) {
        this.pk_FlorID = pk_FlorID;
        this.nameFlower = nameFlower;
        this.countryFlower = countryFlower;
    }

    public Integer getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(Integer pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public String getCountryFlower() {
        return countryFlower;
    }

    public void setCountryFlower(String countryFlower) {
        this.countryFlower = countryFlower;
    }
}