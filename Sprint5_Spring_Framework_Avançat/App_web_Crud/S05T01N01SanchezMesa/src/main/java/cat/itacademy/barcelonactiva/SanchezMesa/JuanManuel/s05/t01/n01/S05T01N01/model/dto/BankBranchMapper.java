package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankBranchMapper {
    BankBranchMapper MAPPER = Mappers.getMapper(BankBranchMapper.class);

    @Mapping(source = "pk_bankBranchId", target = "id")
    BankBranchDto bankBranchToDto(BankBranch bankBranch);

    @Mapping(source = "id", target = "pk_bankBranchId")
    BankBranch dtoToBankBranch(BankBranchDto dto);


    @AfterMapping
    default void setBranchType(@MappingTarget BankBranchDto dto, BankBranch bankBranch){
        dto.setBranchType(dto.getCountryBranch());
    }
}
