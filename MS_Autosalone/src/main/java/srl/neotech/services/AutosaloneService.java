package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.model.Automobile;
import srl.neotech.model.Autosalone;
import srl.neotech.requestresponse.CercaAuto;


@Service
public class AutosaloneService {

	@Autowired
	Autosalone autoSalone;
	
	
	public List<Automobile> confrontaAuto(CercaAuto searchTerm) {
		
		List<Automobile> autoTrovate = new ArrayList<Automobile>();
		
		for (Automobile auto : autoSalone.getAutomobili()) {
			
			if ( searchTerm.getTarga().length()>0 && auto.getTarga().contains(searchTerm.getTarga())) {
				
					autoTrovate.add(auto);
					continue;
				
			
			}
				
				
				if(searchTerm.getColore().length()>0 && auto.getColore().name().equals(searchTerm.getColore())) {
				
					autoTrovate.add(auto);
					continue;
				}
				
				
			}
				
		
	
		return autoTrovate;
	}
	 
	
	
	



}
