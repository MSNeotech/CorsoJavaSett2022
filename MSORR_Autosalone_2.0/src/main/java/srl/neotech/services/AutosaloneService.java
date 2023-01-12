package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;

@Service
public class AutosaloneService {


	public ArrayList<Automobile> getListaAuto(){
		
		Autosalone salone = new Autosalone();
		
		ArrayList <Automobile> listaAuto = salone.getAutomobili();
		
		return listaAuto;
	}
	
}
