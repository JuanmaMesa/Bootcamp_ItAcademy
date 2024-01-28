package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;

import java.util.List;

public interface BankBranchService {

    public List<BankBranch> getAllBranch();
    public BankBranch getOneBranch(Integer Id);
    public BankBranch addBankBranch(BankBranch bankBranch);
    public BankBranch updateBranch(BankBranch bankBranch);
    public void deleteBranch(Integer id);
    public BankBranch findByName(String nameBranch);
    public BankBranch findById(Integer id);




}
