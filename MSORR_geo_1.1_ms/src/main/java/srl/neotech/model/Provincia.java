package srl.neotech.model;

public class Provincia {

	private String sigla;
	private String nome;
	
	
	public Provincia(String sigla, String nome) {
		super();
		this.sigla = sigla;
		this.nome = nome;
	}
	
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
