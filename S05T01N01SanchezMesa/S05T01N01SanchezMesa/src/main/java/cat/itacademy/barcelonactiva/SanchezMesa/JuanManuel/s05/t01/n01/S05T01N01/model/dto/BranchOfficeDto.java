package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BranchOffice;

public class BranchOfficeDto extends BranchOffice {
    private String branchTipe;

    public BranchOfficeDto(String branchTipe) {
        this.branchTipe = branchTipe;
    }
}
