package srl.neotech.requestresponse;

import srl.neotech.model.Elemento;

public class GetElementoResponse extends ResponseBase{
	
	private Elemento elemento;

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	
	

}
