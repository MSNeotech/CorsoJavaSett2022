package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.services.HomeService;


@Controller
public class HomeController {

	@Autowired
	HomeService homeService;
	
    //Rotta per la home
    @GetMapping(value="home")
    public String home(ModelMap modelMap) {
        String url=homeService.getImmagine();
        
        modelMap.addAttribute("urlImmagine",url);
        return "home";
    }
    
   
}
