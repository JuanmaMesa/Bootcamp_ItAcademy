package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.controller;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchMapper;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("api/v1")
public class BankBranchController {
    @Autowired
    private BankBranchService service;

    @GetMapping("/branches")
    public String listBankBranch(Model model){
        List<BankBranchDto>list = service.getAllBranch();
        model.addAttribute("branches",list);
        return "branches";

    }

    @GetMapping ("/branches/add")
    public String showFormulary( Model model){
        model.addAttribute("branch",new BankBranchDto());
        return "createNewBranch";
    }

    @PostMapping("/branches")
    public String addBankBranch(@ModelAttribute("branch") BankBranchDto bankBranchDto){
        service.addBankBranch(bankBranchDto);
        return "redirect:/api/v1/branches";
    }

    @GetMapping("branches/update/{id}")
    public String showUpdateForm(@PathVariable Integer id, Model model){
        model.addAttribute("branch", service.findById(id));
        return "updateBranch";

    }
    @PostMapping("branches/{id}")
    public String updateBranch(@PathVariable Integer id, @ModelAttribute("branch")BankBranchDto bankBranchDto, Model model){

        service.updateBranch(id,bankBranchDto);

        return "redirect:/api/v1/branches";
    }

    @GetMapping("/branches/delete/{id}")
    public String deleteBranch(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        service.deleteBranch(id);
        redirectAttributes.addFlashAttribute("deleted", "BankBranch deleted");
        return "redirect:/api/v1/branches";
    }
    @GetMapping("/branches/getOne/{id}")
    public String getOneBankBranch(@PathVariable Integer id, Model model){
        BankBranch bankBranch = service.getOneBranch(id);
        BankBranchDto bankBranchDto = BankBranchMapper.MAPPER.bankBranchToDto(bankBranch);
        model.addAttribute("branchDto",bankBranchDto);
        return "showBranch";


    }





}
