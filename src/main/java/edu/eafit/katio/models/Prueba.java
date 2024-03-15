package edu.eafit.katio.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Prueba {

@RestController
@RequestMapping("/ensayo")
public class prueba {
    
    @GetMapping("hello")
    public String hello(){
        return "Hola Lucho";
    }

}
}
