package srl.neotech.corsojava.robotagliaerba;

public class TagliaErba  extends Campo{

	private Striscia strisciaInTaglio;
	private Integer passo;
	private String stato;
	private Integer altezzaLama;
	

public Striscia getStrisciaInTaglio() {
		return strisciaInTaglio;
	}


	public void setStrisciaInTaglio(Striscia strisciaInTaglio) {
		this.strisciaInTaglio = strisciaInTaglio;
	}


	public Integer getPasso() {
		return passo;
	}


	public void setPasso(Integer passo) {
		this.passo = passo;
	}


	public String getStato() {
		return stato;
	}


	public void setStato(String stato) {
		this.stato = stato;
	}


	public Integer getAltezzaLama() {
		return altezzaLama;
	}


	public void setAltezzaLama(Integer altezzaLama) {
		this.altezzaLama = altezzaLama;
	}


public void tagliaStriscia() {
	for(int i=0; i<80;i++) {
		avanzaDiUnPasso();
		
		if(i%2==0) {
			
			gira(2, "SX");
		}
		else {
			this.altezzaLama =10;
			gira(2, "DX");
		}
		
		
	}this.altezzaLama=5;
	
	
}

private void avanzaDiUnPasso() {
		passo++;
		stato="In taglio";
		System.out.println("Passo:" +passo + "" +stato);
	
}

private void gira(Integer numeroRotazioni, String direzione) {
	
	if(direzione == "Sx" && numeroRotazioni == 2) System.out.println("Rotazione Sx");
	else System.out.println("Rotazione Dx");
}

	
	
}



