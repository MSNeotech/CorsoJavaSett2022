package srl.neotech.corsojava.robotagliaerba;

public class Striscia extends Campo {

private Integer numeroStriscia;
private Integer altezzaDiTaglio;


public Integer getNumeroStriscia() {
	return numeroStriscia;
}
public void setNumeroStriscia(Integer numeroStriscia) {
	this.numeroStriscia = numeroStriscia;
	System.out.println("Striscia: " + numeroStriscia);
}
public Integer getAltezzaDiTaglio() {
	return altezzaDiTaglio;
}
public void setAltezzaDiTaglio(Integer altezzaDiTaglio) {
	this.altezzaDiTaglio = altezzaDiTaglio;
}

}
