package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchDto;

import java.util.List;

public interface BankBranchService {

    public List<BankBranchDto> getAllBranch();
    public BankBranch getOneBranch(Integer id);
    public BankBranchDto addBankBranch(BankBranchDto bankBranchDto);
    public BankBranchDto updateBranch(Integer id, BankBranchDto dto);
    public void deleteBranch(Integer id);
    public BankBranch findByName(String nameBranch);
    public BankBranchDto findById(Integer id);




}
