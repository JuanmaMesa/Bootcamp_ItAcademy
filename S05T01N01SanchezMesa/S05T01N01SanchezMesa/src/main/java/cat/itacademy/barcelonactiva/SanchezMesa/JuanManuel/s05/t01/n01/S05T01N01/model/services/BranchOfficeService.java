package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BranchOffice;

import java.util.List;

public interface BranchOfficeService {

    List<BranchOffice> findAll();

    BranchOffice findById(Integer id);

    BranchOffice save(BranchOffice branchOffice);
    BranchOffice delete(Integer id);



}
