package srl.neotech.corsojava.gestorenegozio;

public class Prodotto {

	private String codiceABarre;
	private String descrizione;
	private double prezzoUnitario;
	
	
	public String getCodiceABarre() {
		return codiceABarre;
	}
	public void setCodiceABarre(String codiceABarre) {
		this.codiceABarre = codiceABarre;
		System.out.println("Codice: " + codiceABarre);
		
	
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
		System.out.println("Descrizione: " + descrizione);
	}
	public double getPrezzoUnitario() {
		return prezzoUnitario;
		
	}
	
	public void setPrezzoUnitario(double prezzoUnitario) {
		
		this.prezzoUnitario = prezzoUnitario;
		
		double sconto= applicaSconto(prezzoUnitario);
		
		System.out.println("Prezzo: " + sconto);
	}
	
	
	private double applicaSconto(double prezzo) {
	
		double sconto=prezzo*5/100;
		prezzo=prezzo-sconto;
		
		return prezzo;
		
		
	}
	
	
	
	
	
}
