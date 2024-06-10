package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class BankBranchDto  {
    private Integer id;
    private String nameBranch;
    private String countryBranch;
    private String branchType;
    private final static ArrayList<String> EURO_CONTRIES = new ArrayList<>(Arrays.asList("Austria","Belgium","Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic","Denmark","Estonia","Finland","France","Georgia","Germany","Greece","Hungary","Iceland","Ireland","Italy","Spain"));

    public BankBranchDto(){
        this.branchType = isEuCountry(countryBranch)? "UE": "NOT UE";

    }
    public BankBranchDto(Integer id, String nameBranch, String countryBranch) {
        this.id = id;
        this.nameBranch = nameBranch;
        this.countryBranch = countryBranch;
        branchType = isEuCountry(countryBranch)? "UE": "NOT UE";

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBranch() {
        return nameBranch;
    }

    public void setNameBranch(String nameBranch) {
        this.nameBranch = nameBranch;
    }

    public String getCountryBranch() {
        return countryBranch;
    }

    public void setCountryBranch(String countryBranch) {
        this.countryBranch = countryBranch;
    }

    public String getBranchType() {

        return branchType;
    }

    public void setBranchType(String branchTipe) {
        this.branchType = isEuCountry(countryBranch)? "UE": "NOT UE";
    }

    private static boolean isEuCountry(String country){
        return EURO_CONTRIES.contains(country);
    }


}
