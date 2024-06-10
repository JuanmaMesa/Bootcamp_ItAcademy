package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.repository;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankBranchRepository  extends JpaRepository<BankBranch, Integer> {
    public BankBranch findByNameBranch(String nameBranch);


}
