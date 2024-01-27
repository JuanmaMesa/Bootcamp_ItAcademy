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
        return "redirect:branches";
    }

    /*@PostMapping("/branches")
    public String addBankBranch(@ModelAttribute("branch") BankBranch bankBranch, Model model){
        service.addBankBranch(bankBranch);
        model.addAttribute("message", "Sucursal agregada con éxito");
        return "confirmation"; // Asumiendo que tienes una vista llamada 'confirmation.html'
    }*/






}
