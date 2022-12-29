package srl.neotech.model;

import java.math.BigDecimal;

public class Accessorio {

	private String id;
	private EClasseAccessorio classe;
	private ETipologiaAccessorio tipologia;
	private String descrizione;
	private BigDecimal costo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EClasseAccessorio getClasse() {
		return classe;
	}
	public void setClasse(EClasseAccessorio classe) {
		this.classe = classe;
	}
	public ETipologiaAccessorio getTipologia() {
		return tipologia;
	}
	public void setTipologia(ETipologiaAccessorio tipologia) {
		this.tipologia = tipologia;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public BigDecimal getCosto() {
		return costo;
	}
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}
	
	@Override
	public String toString() {
		return "Accessorio [id=" + id + ", classe=" + classe + ", tipologia=" + tipologia + ", descrizione="
				+ descrizione + ", costo=" + costo + "]";
	}
	
	
	
}
