package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t01.n01.S04T01N01SanchezMesaJuanma.Controllers;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s04.t01.n01.S04T01N01SanchezMesaJuanma.models.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
@SpringBootApplication
@RestController
public class HelloWorldController {
    User user = new User();
    @GetMapping("/HelloWorld")
    public String Hello (@RequestParam( name = "name", defaultValue = "UNKNOWN")String name){
       // User user = new User();
         user.setName(name);

        return "Hola, "+ user.getName()+ ". Estas ejecutando un proyecto Maven. ";
    }

    @GetMapping(value = {"/HelloWorld2",   "/HelloWorld2/{nom}"})
    public String Hello2(@PathVariable (name = "nom", required = false) String name){
        if(name == null){
            user.setName("UNKNOWN");

        }else{
            user.setName(name);
        }
        return "Hola, "+user.getName()+ ". Estas ejecutando un proyecto Maven2.";
    }



 @GetMapping("/")
    public Map<String, String> hello(){
     Map<String, String> json = new HashMap<>();
     json.put("Date", new Date().toString());
     json.put("Message:", "Hola mundo");
     return  json;


    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        user.setName(user.getName().toUpperCase());
        return user;
    }




}
