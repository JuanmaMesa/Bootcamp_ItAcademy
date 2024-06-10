package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.model.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class FlowerDto {

    private Integer pk_FlorID;
    private String nameFlower;
    private String countryFlower;
    private String flowerType;

    private final static ArrayList<String> EURO_CONTRIES = new ArrayList<>(Arrays.asList("Austria","Belgium","Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic","Denmark","Estonia","Finland","France","Georgia","Germany","Greece","Hungary","Iceland","Ireland","Italy","Spain"));

    public FlowerDto(){
       flowerType = isEuCountry(countryFlower)? "UE": "NOT UE";
    }

    public FlowerDto(Integer pk_FlorID, String nameFlower, String countryFlower, String branchType) {
        this.pk_FlorID = pk_FlorID;
        this.nameFlower = nameFlower;
        this.countryFlower = countryFlower;
        this.flowerType = branchType;
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

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String countryFlower) {
        this.flowerType = isEuCountry(countryFlower)? "UE":"NOT UE";
    }

    private static boolean isEuCountry(String country){
        return EURO_CONTRIES.contains(country);
    }


}
