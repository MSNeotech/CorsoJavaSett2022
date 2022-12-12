package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neotech.model.Elemento;
import srl.pippo.fuoriContext.Automobile;

@Controller
public class MusicController {
	
	//IOC: Inversion of Control.
	
	@Autowired //voglio usare 
	Automobile auto;
	
	//dimenticatevi le variabili livello di classe.
	
	
	//Rotta
	@GetMapping(value="prima_rotta/{id}/{citta}")
	//le chiamate sono serializzate....
	public String primaRotta(
		@PathVariable("id") String idDato,
		@PathVariable("citta") String cittaDato
		) {
		int contaOggetti=0;
		auto.getMotore().setCilindrata(3000);
		System.out.println(auto.getMotore().getCilindrata());
		contaOggetti=contaOggetti+1;
		System.out.println(idDato);
		System.out.println(cittaDato);
		return "test";
	}
	
	
	@PostMapping(value="testPost", headers = "Accept=application/json")
	public String testPost(@RequestBody Elemento elemento) {
		System.out.println(elemento.getDescrizione());
		return "test";
	}
	 
	//Rotta
	@GetMapping(value="testJQuery")
	public String testJQuery(ModelMap modelMap, 
			@RequestParam("giorno") String giornoDato, 
			@RequestParam("citta")  String cittaDato,
			@RequestParam("piatto") String piattoDato) {
		System.out.println("Parametri arrivati dal client:"+giornoDato+" "+cittaDato+" "+piattoDato);
		modelMap.addAttribute("datoInviatoDalServer", "hello world!");
		return "testJQuery";
	}
	
	
	//Rotta
	@GetMapping(value="impiccato")
	public String impiccato() {
		return "impiccato";
	}
}
