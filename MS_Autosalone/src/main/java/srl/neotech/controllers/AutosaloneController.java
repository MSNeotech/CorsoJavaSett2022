package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	public String detailsAuto() {
		
		return "detailsAuto";
	}
	
}
