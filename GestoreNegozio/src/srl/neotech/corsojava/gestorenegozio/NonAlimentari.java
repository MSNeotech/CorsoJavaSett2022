package srl.neotech.corsojava.gestorenegozio;

public class NonAlimentari extends Prodotto {

	private String materiale;

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
		System.out.println("Materiale: " + materiale);
	}
	
	
}
