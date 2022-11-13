package srl.neotech.corsojava.gestionebiblioteca;

public class Libro {
	
	private Integer idLibro;
	private String titolo;
	private String autore;
    enum sezione {horror,fantasy,giallo,scientifico,romanzo};
	private Integer scaffale;
	private String sezione;
	

	
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public Integer getScaffale() {
		return scaffale;
	}
	public void setScaffale(Integer scaffale) {
		this.scaffale = scaffale;
	}
	
	
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autore=" + autore + ", scaffale=" + scaffale
				+ ", sezione=" + sezione + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
