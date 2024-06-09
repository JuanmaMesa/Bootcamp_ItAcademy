package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t01.n02.S04T01N02SanchezMesaJuanma.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Hello(@RequestParam(name = "name", defaultValue = "UNKNONW") String otherName){
        return "Hola, "+ otherName + ". Estas ejecutando un proyecto Gradle";

    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{name}"})
    public String Hello2(@PathVariable(name = "name", required = false) String name){

        if(name == null){
            name = "UNKONWN";
        }
        return "Hola "+ name + ". Estas ejecutando un proyecto Gradle";

    }

    


}
