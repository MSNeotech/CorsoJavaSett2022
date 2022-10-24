package srl.neotech.corsojava.listgiocattoli;

import java.util.ArrayList;

public class Startup {

	static ArrayList<Giocattoli> giocattoli = new ArrayList<Giocattoli>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<=800; i++) {
			Giocattoli g = new Giocattoli();
			g.materiale = "Plastica";
			if(i>=0 && i<=100) g.colore = "Rosso";
			if(i>=101 && i<=200) g.colore = "Verde";
			if(i>=201 && i<=300) g.colore = "Viola";
			if(i>=301 && i<=400) g.colore = "Giallo";
			else g.colore = "Nero";
			giocattoli.add(g);
		}
		
		for(Giocattoli g:giocattoli) {
			System.out.println("Colore: " + g.colore + " Materiale: " + g.materiale);
		}
		

	}

}
