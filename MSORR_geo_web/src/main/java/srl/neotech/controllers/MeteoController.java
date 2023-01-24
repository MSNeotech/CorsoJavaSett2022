package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeteoController {


	@GetMapping(value="/")
	public String meteo() {
	return "meteo";
	}
	
	
}
