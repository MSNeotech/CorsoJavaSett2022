package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.giochi.Gioco;

@Controller
public class ForzaController {
	
	@Autowired
	Gioco game;

	@GetMapping(value="forza")
	public String GameForza() {
		Integer cont=0;
		game.getEn().setNome("Unity");
		game.getEn().setLinguaggio("C#");
		game.getEn().setVersione(2021.3);
		cont++;
	    System.out.println("Nome: " + game.getEn().getNome());
	    System.out.println("Linguaggio usato: " + game.getEn().getLinguaggio());
	    System.out.println("Versione: " +game.getEn().getVersione());
	    System.out.println("N. accesso: " +cont);
		return "forza";
	}
	
}
