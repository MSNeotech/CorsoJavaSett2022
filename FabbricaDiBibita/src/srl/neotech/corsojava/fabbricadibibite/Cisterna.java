package srl.neotech.corsojava.fabbricadibibite;

public class Cisterna{
	
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private String tipo;
	
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
		System.out.println("Tipo: " +tipo);
	}
	
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
		System.out.println("Quantità: " +quantita+ " litri");
	}
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay(Integer evapPerDay) {
		this.evapPerDay = evapPerDay;
		System.out.println("Evaporazione: " +evapPerDay);
	}
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas(Integer livelloGas) {
		this.livelloGas = livelloGas;
		System.out.println("Livello gas: " +livelloGas);
	}
	
	

}
