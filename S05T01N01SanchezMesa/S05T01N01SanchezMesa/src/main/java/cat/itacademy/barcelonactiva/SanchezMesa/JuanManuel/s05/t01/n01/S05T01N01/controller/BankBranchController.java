package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.controller;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.dto.BankBranchDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
//@RequestMapping("api/v1/branch")
public class BankBranchController {
    @Autowired
    private BankBranchService service;

    @GetMapping("/branches")
    public String listBankBranch(Model model){
        List<BankBranchDto>lista = service.getAllBranch();
        model.addAttribute("branches",lista);
        //model.addAttribute("branches", service.getAllBranch());
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
        return "redirect:/branches";
    }

    @GetMapping("branches/update/{id}")
    public String showUpdateForm(@PathVariable Integer id, Model model){
        model.addAttribute("branch", service.findById(id));
        return "updateBranch";

    }
    @PostMapping("branches/{id}")
    public String updateBranch(@PathVariable Integer id, @ModelAttribute("branch")BankBranchDto bankBranchDto, Model model){

        service.updateBranch(id,bankBranchDto);

        return "redirect:/branches";
    }

    @GetMapping("/branches/delete/{id}")
    public String deleteBranch(@PathVariable Integer id){
        service.deleteBranch(id);
        return "redirect:/branches";
    }





}
