package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

	@GetMapping(value="Game")
	
	public String Game() {
		return "game";
	}
}
