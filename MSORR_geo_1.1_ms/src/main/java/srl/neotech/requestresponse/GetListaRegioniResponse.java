package srl.neotech.requestresponse;


import java.util.List;

import srl.neotech.model.Regione;

public class GetListaRegioniResponse extends ResponseBase {

	private List<Regione> regione;

	public List<Regione> getRegione() {
		return regione;
	}

	public void setRegione(List<Regione> regione) {
		this.regione = regione;
	}
	
	

	
}
