package srl.neotech.corsojava.partitascacchi;

public class Cella {
	
	private Integer posizione;
	private String colore;
	private Pezzo Pezzo;
	
	public Pezzo getPezzo() {
		return Pezzo;
	}
	public void setPezzo(Pezzo pezzo) {
		Pezzo = pezzo;
	}
	public Integer getPosizione() {
		return posizione;
	}
	public void setPosizione(Integer posizione) {
		this.posizione = posizione;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
	

}
