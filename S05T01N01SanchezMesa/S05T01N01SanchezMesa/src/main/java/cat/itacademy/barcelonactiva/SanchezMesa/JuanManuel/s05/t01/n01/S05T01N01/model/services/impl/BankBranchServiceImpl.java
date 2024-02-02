package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.impl;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.repository.BankBranchRepository;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankBranchServiceImpl implements BankBranchService {

    @Autowired
    private BankBranchRepository repository;
    @Override
    public List<BankBranchDto> getAllBranch() {
        List<BankBranch>branches = repository.findAll();
        return  branches.stream().map(BankBranchMapper.MAPPER::bankBranchToDto)
                .collect(Collectors.toList());

        //List<BankBranchDto>dtoList = branches.stream()
          //      .map(BankBranchMapper.mapper::bankBranchToDto)
            //    .collect(Collectors.toList());
        //return dtoList;

    }

    @Override
    public BankBranch getOneBranch(Integer Id) {
        return null;
    }

    @Override
    public BankBranchDto addBankBranch(BankBranchDto bankBranchDto) {
        BankBranch bankBranch1 = BankBranchMapper.MAPPER.dtoToBankBranch(bankBranchDto);

        BankBranch savedBankBranch = repository.save(bankBranch1);

        return BankBranchMapper.MAPPER.bankBranchToDto(savedBankBranch);

    }

    @Override
    public BankBranchDto updateBranch(Integer id, BankBranchDto dto) {
        BankBranch bankBranch2 = repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Not found with id "+ id));
        bankBranch2.setNameBranch(dto.getNameBranch());
        bankBranch2.setCountryBranch(dto.getCountryBranch());
        BankBranch updateBankBranch = repository.save(bankBranch2);
        return BankBranchMapper.MAPPER.bankBranchToDto(bankBranch2);
    }


    @Override
    public void deleteBranch(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public BankBranch findByName(String nameBranch) {
        return repository.findByNameBranch(nameBranch);
    }

    @Override
    public BankBranchDto findById(Integer id) {
        BankBranch bankBranch = repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("bankBranch not found with id "+ id));
        return BankBranchMapper.MAPPER.bankBranchToDto(bankBranch);
    }
}



