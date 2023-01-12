package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Automobile;

public class GetListaAutoResponse extends ResponseBase{

	private ArrayList<Automobile> listaAuto = new ArrayList<Automobile>();

	public ArrayList<Automobile> getListaAuto() {
		return listaAuto;
	}

	public void setListaAuto(ArrayList<Automobile> listaAuto) {
		this.listaAuto = listaAuto;
	}
	
	
	
	
	
}
