package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import srl.neotech.dao.AutosaloneDAO;
import srl.neotech.model.Automobile;
import srl.neotech.requestresponse.RequestAddAuto;
import srl.neotech.requestresponse.RequestSearchAuto;

@Service
public class AutosaloneService {

	@Autowired
	AutosaloneDAO salone;
    	
	public ArrayList<Automobile> getListaAuto(){
		
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
	
	
	
	  @Transactional 
	  public Automobile addAuto(RequestAddAuto response) {
	  
	  Automobile autoAdd = new Automobile(response.getId(),response.getTarga(),
	  response.getColore());
	  
	  System.out.println("Auto creata: " + autoAdd);
	    salone.getAutomobili().add(autoAdd);
	    System.out.println("Auto aggiunta alla lista: " + salone.getAutomobili());
	  return autoAdd;
	  }
	 
	 
	 @Transactional
	 public void removeAutoById(String idRemove) {
			List<Automobile> automobiliDaRimuovere = new ArrayList<>();

			for (Automobile auto : salone.getAutomobili()) {
				if (auto.getId().equals(idRemove)) {
					automobiliDaRimuovere.add(auto);
				}
			}
			salone.getAutomobili().removeAll(automobiliDaRimuovere);
	
		}
	 
		/*
		 * @Transactional public List<Automobile> confrontaAuto(RequestSearchAuto
		 * searchTerm) {
		 * 
		 * List<Automobile> autoTrovate = new ArrayList<Automobile>();
		 * 
		 * for (Automobile auto : salone.getAutomobili()) {
		 * 
		 * if ( searchTerm.getTarga().length()>0 &&
		 * auto.getTarga().contains(searchTerm.getTarga())) {
		 * 
		 * autoTrovate.add(auto); continue; }
		 * 
		 * if(searchTerm.getColore().length()>0 &&
		 * auto.getColore().name().equals(searchTerm.getColore())) {
		 * 
		 * autoTrovate.add(auto); continue; } }
		 * 
		 * return autoTrovate; }
		 */
	 
	 @Transactional
	 public List<Automobile> confrontaAuto(RequestSearchAuto searchTerm) {

	     List<Automobile> autoTrovate = new ArrayList<Automobile>();

	     for (Automobile auto : salone.getAutomobili()) {

	         if (searchTerm.getTarga() != null && searchTerm.getTarga().length() > 0
	                 && auto.getTarga().contains(searchTerm.getTarga())) {

	             autoTrovate.add(auto);
	             continue;
	         }

	         if (searchTerm.getColore() != null && searchTerm.getColore().length() > 0
	                 && auto.getColore().name().equalsIgnoreCase(searchTerm.getColore())) {

	             autoTrovate.add(auto);
	             continue;
	         }
	     }

	     return autoTrovate;
	 }

	
}
