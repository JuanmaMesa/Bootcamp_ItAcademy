package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameDiceController {
    @GetMapping("")
    public String ShowFirstPAge(){
        return "index";
    }

}
