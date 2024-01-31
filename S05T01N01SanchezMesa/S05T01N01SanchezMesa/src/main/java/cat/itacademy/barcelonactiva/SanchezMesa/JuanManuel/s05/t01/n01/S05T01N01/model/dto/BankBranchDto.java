package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;

public class BankBranchDto  {
    private Integer id;
    private String nameBranch;
    private String countryBranch;
    private String branchType;

    public BankBranchDto(){

    }
    public BankBranchDto(Integer id, String nameBranch, String countryBranch, String branchTipe) {
        this.id = id;
        this.nameBranch = nameBranch;
        this.countryBranch = countryBranch;
        this.branchType = branchTipe;
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

    public String getBranchTipe() {
        return branchType;
    }

    public void setBranchTipe(String branchTipe) {
        this.branchType = branchTipe;
    }
    public BankBranchDto dto( BankBranchDto bankBranchDto){


        return null;
    }

}
