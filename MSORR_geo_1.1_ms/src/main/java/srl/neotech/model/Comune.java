package srl.neotech.model;

public class Comune {

	private String istat;
	private String nome;
	private String siglaProvincia;
	private String lat;
	private String lang;
	
	
	public Comune(String istat, String nome, String siglaProvincia) {
		super();
		this.istat = istat;
		this.nome = nome;
		this.siglaProvincia = siglaProvincia;

	}
	
	
	public Comune(String lat, String lang) {
		super();
		this.lat = lat;
		this.lang = lang;
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
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	
}
