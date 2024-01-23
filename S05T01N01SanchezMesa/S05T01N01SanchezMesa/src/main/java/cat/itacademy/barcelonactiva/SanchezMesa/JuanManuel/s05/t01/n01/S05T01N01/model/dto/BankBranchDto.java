package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;

public class BankBranchDto extends BankBranch {
    private String branchTipe;

    public BankBranchDto(String branchTipe) {
        this.branchTipe = branchTipe;
    }
}
