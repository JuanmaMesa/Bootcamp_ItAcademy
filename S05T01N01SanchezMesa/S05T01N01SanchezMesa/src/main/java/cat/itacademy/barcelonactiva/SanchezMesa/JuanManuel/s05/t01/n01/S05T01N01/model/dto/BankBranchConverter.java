package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankBranchConverter {
    BankBranchConverter mapper = Mappers.getMapper(BankBranchConverter.class);
    @Mapping(source ="pk_bankBranchId", target = "id")
    //@Mapping(source ="nameBranch", target = "id")
    //@Mapping(source ="countryBranch", target = "id")
    //@Mapping(source ="branchType", target = "id")
    BankBranchDto brandDTO(BankBranch bankBranch);

    @Mapping(source = "id", target = "pk_bankBrandId")
    BankBranch branch( BankBranchDto branchDto);


//@Mappings({
//       @Mapping(source = "itemId", target = "persistenceItemId"),
//       @Mapping(target = "supplyType", ignore = true),
//       @Mapping(target = "size", defaultValue = "10")
//})
}
//https://www.adictosaltrabajo.com/2020/04/14/como-mapear-objetos-en-java-con-mapstruct/ liches.org