package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.controllers;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain.PlayerEntity;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto.PlayerDto;
import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameDiceController {
    @Autowired
    private PlayerService service;



    @GetMapping("home")
    public String ShowFirstPage(){
        return "index";
    }

    @GetMapping("/add")
    public String showFormulary(Model model){
        model.addAttribute("player", new PlayerDto());
        return "createPlayerForm";
    }

    @PostMapping("/player")
    public String addPlayer(@ModelAttribute("player") PlayerDto playerDto, BindingResult result){
        if(result.hasErrors()){
            //Todo manejar error
            return "createPlayerForm";
        }
        service.addPlayer(playerDto);
        return "redirect:/home?success";
    }




}
