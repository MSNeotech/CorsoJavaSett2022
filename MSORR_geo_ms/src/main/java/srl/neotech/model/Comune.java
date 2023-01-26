package srl.neotech.model;

public class Comune {

	private String istat;
	private String nome;
	private String siglaProvincia;
	
	public Comune(String istat, String nome, String siglaProvincia) {
		super();
		this.istat = istat;
		this.nome = nome;
		this.siglaProvincia = siglaProvincia;

	}
	public String getIstat() {
		return istat;
	}
	public void setIstat(String istat) {
		this.istat = istat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiglaProv() {
		return siglaProvincia;
	}
	public void setSiglaProv(String siglaProv) {
		this.siglaProvincia = siglaProv;
	}
	
}
