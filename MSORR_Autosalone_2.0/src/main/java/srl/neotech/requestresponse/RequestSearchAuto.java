package srl.neotech.requestresponse;

import java.util.ArrayList;
import java.util.List;

import srl.neotech.model.Automobile;

public class RequestSearchAuto extends ResponseBase{
	
	private String targa;
	private String colore;
	
	 private List<Automobile> auto = new ArrayList<Automobile>();

	 public List<Automobile> getAuto() {
	    return auto;
	 }

	 public void setAuto(List<Automobile> auto) {
	    this.auto = auto;
	 }
	

	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
}
