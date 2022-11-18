package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aereo extends Aeroporto{

	private Integer IdUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private ModelloAereo modello;
	private List<Passeggero> passeggeri = new ArrayList<Passeggero>();
	private Integer velocità;
	private Integer distanzaDallAeroporto;
	private Stato stato;
	
	
	public Integer getIdUnivoco() {
		return IdUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		IdUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getVelocità() {
		return velocità;
	}
	public void setVelocità(Integer velocità) {
		this.velocità = velocità;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	@Override
	public String toString() {
		return "Aereo [IdUnivoco=" + IdUnivoco + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", modello=" + modello + ", passeggeri=" + passeggeri + ", velocità=" + velocità
				+ ", distanzaDallAeroporto=" + distanzaDallAeroporto + ", stato=" + stato + "]";
	}
	
	
	
	
}
