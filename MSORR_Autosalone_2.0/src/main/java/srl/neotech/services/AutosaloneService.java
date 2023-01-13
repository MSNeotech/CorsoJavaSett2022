package srl.neotech.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.AutosaloneDAO;
import srl.neotech.model.Automobile;
import srl.neotech.requestresponse.RequestAddAuto;

@Service
public class AutosaloneService {

	@Autowired
	AutosaloneDAO salone;
    	
	public ArrayList<Automobile> getListaAuto(){
	
		
		//ArrayList <Automobile> listaAuto = salone.getAutomobili();
		
		return salone.getAutomobili();
	}
	
	public Automobile searchById(String id) {
		Automobile autoTrovata = new Automobile();
		
		for(Automobile auto: salone.getAutomobili()) {
			if(auto.getId().equals(id))
				autoTrovata = auto;
		}
		return autoTrovata;
	}
	
	
	/*
	 * public void addAuto(RequestAddAuto response) {
	 * 
	 * Automobile autoAdd = new Automobile(response.getId(),response.getTarga());
	 * 
	 * 
	 * }
	 */
	
	
}
