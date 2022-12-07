package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForzaController {

	@GetMapping(value="forza")
	
	public String GameForza() {
		return "forza";
	}
}
