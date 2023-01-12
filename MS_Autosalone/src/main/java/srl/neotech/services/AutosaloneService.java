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
		autoTrovate.addAll(autoSalone.getAutomobili());
		
		for (Automobile auto : autoTrovate) {
			
			if (searchTerm.getTarga() != null && searchTerm.getTarga().isEmpty()==false) {
				if (auto.getTarga().contains(searchTerm.getTarga())==false) {
			
					autoTrovate.remove(auto);
					continue;
			}
			}
				
				/*if (searchTerm.getColore() != null && searchTerm.getColore().isEmpty()==false) {
				if(auto.getColore().equals(searchTerm.getColore())) {
				
					autoTrovate.remove(auto);
					continue;
				}
			}*/
			
				if (searchTerm.getCosto() != null && searchTerm.getCosto().isEmpty()==false) {
					if(auto.getCosto().equals(searchTerm.getCosto())) {
					
						autoTrovate.remove(auto);
						continue;
					}
				}
				if (searchTerm.getCostruttore() != null && searchTerm.getCostruttore().isEmpty()==false) {
					if(auto.getCostruttore().equals(searchTerm.getCostruttore())) {
						
						autoTrovate.remove(auto);
						continue;
					}
				}
			
		}
		
		
	
		return autoTrovate;
	}
	 
	
	
	



}
