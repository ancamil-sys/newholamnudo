package holamundo1.holamundo1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HolaMundoController {
  
    @GetMapping("/Hola")
    public String  holamundo() {
        return "Wenaaa willy qlo porfin lo pude hacer";
    }
    
}
