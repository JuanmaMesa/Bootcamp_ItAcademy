package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.controller;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("api/v1/branch")
public class BankBranchController {
    @Autowired
    private BankBranchService service;

    @GetMapping("/branches")
    public String listBankBranch(Model model){
        model.addAttribute("branches", service.getAllBranch());
        return "branches";

    }

    @GetMapping ("/branches/add")
    public String showFormulary( Model model){
        BankBranch bankBranch = new BankBranch();
        model.addAttribute("branch", bankBranch);
        return "createNewBranch";
    }

    @PostMapping("/branches")
    public String addBankBranch(@ModelAttribute("branch") BankBranch bankBranch){
        service.addBankBranch(bankBranch);
        return "redirect:/branches";
    }

    @GetMapping("branches/update/{id}")
    public String showUpdateForm(@PathVariable Integer id, Model model){
        model.addAttribute("branch", service.findById(id));
        return "updateBranch";

    }
    @PostMapping("branches/{id}")
    public String updateBranch(@PathVariable Integer id, @ModelAttribute("branch")BankBranch bankBranch, Model model){
        BankBranch updateBanckBranch = service.findById(id);
        updateBanckBranch.setPk_bankBranchId(id);
        updateBanckBranch.setNameBranch(bankBranch.getNameBranch());
        updateBanckBranch.setCountryBranch(bankBranch.getCountryBranch());
        service.updateBranch(updateBanckBranch);

        return "redirect:/branches";
    }

    @GetMapping("/branches/delete/{id}")
    public String deleteBranch(@PathVariable Integer id){
        service.deleteBranch(id);
        return "redirect:/branches";
    }





}
