package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.repository.BankBranchRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankBranchServiceImpl implements BankBranchService {

    @Autowired
    private BankBranchRepository repository;
    @Override
    public List<BankBranch> getAllBranch() {
        return repository.findAll();
    }

    @Override
    public BankBranch getOneBranch(Integer Id) {
        return null;
    }

    @Override
    public BankBranch addBankBranch(BankBranch bankBranch) {
        return repository.save(bankBranch);

    }

    @Override
    public void updateBranch(BankBranch bankBranch) {

    }

    @Override
    public void deleteBranch(Integer id) {

    }

    @Override
    public BankBranch findByName(String nameBranch) {
        return null;
    }
}


