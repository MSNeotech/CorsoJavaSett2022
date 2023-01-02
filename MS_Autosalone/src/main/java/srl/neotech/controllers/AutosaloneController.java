package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Accessorio;
import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;

@Controller
public class AutosaloneController {

	@Autowired
	Autosalone autoSalone;
	
	@GetMapping("/listAuto")
	public String getListaAuto(ModelMap modelMap) {
		
		modelMap.addAttribute("listaAuto",autoSalone.getAutomobili());
		return "listaAuto";
	}
	
	
	@GetMapping("/addAuto")
	public String aggiungiAuto(ModelMap modelMap) {
		modelMap.addAttribute("automobili", autoSalone.getAutomobili());
		return "addAuto";
		
	}
	
	@PostMapping("/add")
	public String Add(@ModelAttribute  Automobile auto) {
		
	    autoSalone.getAutomobili().add(auto);
		return "redirect:/listAuto";
	}
	
	@GetMapping("/removeAuto")
	public String removeAuto(ModelMap modelMap) {
		
		modelMap.addAttribute("listaAuto", autoSalone.getAutomobili());
		
		return "removeAuto";
	}
	
	
	@GetMapping("/detailsAuto")
	public String detailsAuto(@RequestParam String id, ModelMap modelMap) {

		   Automobile auto = autoSalone.getAutomobileById(id);
	        modelMap.addAttribute("auto", auto);
	        modelMap.addAttribute("listaccessori", auto.getAccessori());
	        return "detailsAuto";
	}


	

}
