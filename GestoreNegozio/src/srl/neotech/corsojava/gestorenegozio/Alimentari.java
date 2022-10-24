package srl.neotech.corsojava.gestorenegozio;

public class Alimentari extends Prodotto {

	private String dataDiScadenza;

	public String getDataDiScandeza() {
		return dataDiScadenza;
	}

	public void setDataDiScandeza(String dataDiScadenza) {
		this.dataDiScadenza = dataDiScadenza;
		System.out.println("Data di scadenza: " + dataDiScadenza);
		
		
	}
	
	
	
	
}
