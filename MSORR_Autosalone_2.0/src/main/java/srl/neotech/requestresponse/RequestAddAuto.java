package srl.neotech.requestresponse;

import srl.neotech.model.Automobile;
import srl.neotech.model.EColore;

public class RequestAddAuto extends ResponseBase{

	private String id;
	private String targa;
	private EColore colore;
	
	 private Automobile auto;

	 public Automobile getAuto() {
	    return auto;
	 }

	 public void setAuto(Automobile auto) {
	    this.auto = auto;
	 }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public EColore getColore() {
		return colore;
	}
	public void setColore(EColore colore) {
		this.colore = colore;
	}
	@Override
	public String toString() {
		return "RequestAddAuto [id=" + id + ", targa=" + targa + ", colore=" + colore + "]";
	}
	
	
	
	
	
	
}
