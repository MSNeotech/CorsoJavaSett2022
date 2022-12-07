package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    //Rotta per la home
    @GetMapping(value="/")
    public String home() {
        return "home";
    }
    
   
}
