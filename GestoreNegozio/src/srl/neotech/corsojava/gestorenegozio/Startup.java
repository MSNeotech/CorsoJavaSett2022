package srl.neotech.corsojava.gestorenegozio;

import java.util.ArrayList;

public class Startup {

	static ArrayList <Prodotto> prodotti = new ArrayList<Prodotto>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<100;i++) {
			
			Alimentari alim = new Alimentari();
			alim.setDescrizione("Pasta corta, cottura 10 minuti");
			alim.setPrezzoUnitario(1);
			alim.setDataDiScandeza("10-10-2022");
			alim.setCodiceABarre("8J5L264O8");
			prodotti.add(alim);
			
		}
		for(int j=0;j<100;j++) {
            
			NonAlimentari nonAlim = new NonAlimentari();
			nonAlim.setDescrizione("Robot giocattolo telecomandato");
			nonAlim.setMateriale("Plastica");
			nonAlim.setCodiceABarre("U8J5K6L2O974");
			nonAlim.setPrezzoUnitario(50);
			prodotti.add(nonAlim);
			
		}
		
	}

}
