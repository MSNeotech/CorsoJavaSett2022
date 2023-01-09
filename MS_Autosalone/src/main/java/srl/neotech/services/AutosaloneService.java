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
				System.out.println("Auto da rimuovere" +auto.getTarga());
					autoTrovate.remove(auto);
					continue;
			}
			}
				
				if (searchTerm.getColore() != null && searchTerm.getColore().isEmpty()==false) {
				if(auto.getColore().equals(searchTerm.getColore())) {
					System.out.println("Auto da rimuovere" +auto.getColore());
					autoTrovate.remove(auto);
					continue;
				}
			}
			
				if (searchTerm.getCosto() != null && searchTerm.getCosto().isEmpty()==false) {
					if(auto.getCosto().equals(searchTerm.getCosto())) {
						System.out.println("Auto da rimuovere" +auto.getCosto());
						autoTrovate.remove(auto);
						continue;
					}
				}
				if (searchTerm.getCostruttore() != null && searchTerm.getCostruttore().isEmpty()==false) {
					if(auto.getCostruttore().equals(searchTerm.getCostruttore())) {
						System.out.println("Auto da rimuovere" +auto.getCostruttore());
						autoTrovate.remove(auto);
						continue;
					}
				}
			
		}
		
		
		System.out.println("Auto trovate: " + autoTrovate);
		return autoTrovate;
	}
	 
	
	
	



}
