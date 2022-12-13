package srl.neotech.giochi;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String nome;
	private String linguaggio;
	private Double versione;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLinguaggio() {
		return linguaggio;
	}
	public void setLinguaggio(String linguaggio) {
		this.linguaggio = linguaggio;
	}
	public Double getVersione() {
		return versione;
	}
	public void setVersione(Double versione) {
		this.versione = versione;
	}
	
	
}
