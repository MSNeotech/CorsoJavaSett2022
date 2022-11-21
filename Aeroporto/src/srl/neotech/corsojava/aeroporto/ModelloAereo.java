package srl.neotech.corsojava.aeroporto;

public class ModelloAereo extends Aereo {
	
	private String costruttore;
	private String codiceModello;
	private Integer capienzaNumPasseggeri;
	
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	public String getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(String codiceModello) {
		this.codiceModello = codiceModello;
	}
	public Integer getCapienzaNumPasseggeri() {
		return capienzaNumPasseggeri;
	}
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		this.capienzaNumPasseggeri = capienzaNumPasseggeri;
	}
	@Override
	public String toString() {
		return "ModelloAereo [costruttore=" + costruttore + ", codiceModello=" + codiceModello
				+ ", capienzaNumPasseggeri=" + capienzaNumPasseggeri + "]";
	}
	
	
	

}
