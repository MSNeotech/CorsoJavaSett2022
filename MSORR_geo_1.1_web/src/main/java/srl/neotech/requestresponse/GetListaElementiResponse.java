package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.Elemento;

public class GetListaElementiResponse extends ResponseBase{
	
	private ArrayList<Elemento> elementi=new ArrayList<Elemento>();

	public ArrayList<Elemento> getElementi() {
		return elementi;
	}

	public void setElementi(ArrayList<Elemento> elementi) {
		this.elementi = elementi;
	}
	
	

}
