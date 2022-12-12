package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GiocoController {

	
	@GetMapping("forza4")
	public String forzaQuattro() {
		return "forzaQuattro";
	}
}
