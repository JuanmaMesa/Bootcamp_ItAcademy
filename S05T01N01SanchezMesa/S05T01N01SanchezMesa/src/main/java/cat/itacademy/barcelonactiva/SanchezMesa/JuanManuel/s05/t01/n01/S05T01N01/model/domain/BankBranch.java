package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "branch")
public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_bankBranchId;

    @Column(name ="nameBranch", nullable = false, length = 50)
    private String nameBranch;

    @Column(name ="countryBranch", nullable = false, length = 50)
    private String countryBranch;



    public BankBranch(){

    }
    public BankBranch(Integer pk_bankBranchId, String nameBranch, String countryBranch) {
        this.pk_bankBranchId = pk_bankBranchId;
        this.nameBranch = nameBranch;
        this.countryBranch = countryBranch;
    }


    public Integer getPk_bankBranchId() {
        return pk_bankBranchId;
    }

    public void setPk_bankBranchId(Integer pk_bankBranchId) {
        this.pk_bankBranchId = pk_bankBranchId;
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
}



