package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping(value="appWeb")
	
	public String WebStatic() {
		return "static01";
	}
	
}
