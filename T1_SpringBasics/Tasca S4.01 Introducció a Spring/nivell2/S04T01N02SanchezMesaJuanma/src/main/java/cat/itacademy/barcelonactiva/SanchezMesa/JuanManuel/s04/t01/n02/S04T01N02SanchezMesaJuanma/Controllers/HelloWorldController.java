package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t01.n02.S04T01N02SanchezMesaJuanma.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Hello(@RequestParam(name = "nom", defaultValue = "UNKNONW") String nom){
        return "Hola, "+ nom + ". Estas ejecutando un proyecto Gradle";

    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String Hello2(@PathVariable(name = "nom", required = false) String nom){

        if(nom == null){
            nom = "UNKONWN";
        }
        return "Hola "+ nom + ". Estas ejecutando un proyecto Gradle";

    }

    


}
