package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
	
	private List<Aereo> aerei = new ArrayList<Aereo>();
	private List<Passeggero> passeggeri = new ArrayList<Passeggero>();
	private Integer raggioDiAzione;
	
	
	public List<Aereo> getAerei() {
		return aerei;
	}
	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
	
	
	public Aereo decollo(Aereo a) {
		while(a.getDistanzaDallAeroporto()<this.raggioDiAzione) {
		a.setStato(Stato.DECOLLATO);
		Integer distanzaAttuale= a.getDistanzaDallAeroporto()+ a.getVelocità();
		a.setDistanzaDallAeroporto(distanzaAttuale);
		 System.out.println("Blink! " +a);	
		}
		a.setStato(a.getStato().FUORI_SPAZIO_AEREO);
		System.out.println("\n" +"Aereo fuori spazio aereo: " +a+"\n");
		for(Passeggero p: a.getPasseggeri()) {
			this.checkin(p);
		}
		
		return a;
	}
	
	public Aereo atterraggio(Aereo a) {
		
		while(a.getDistanzaDallAeroporto()>0) {
	     Integer distanzaAttuale= a.getDistanzaDallAeroporto()- a.getVelocità();
	     a.setDistanzaDallAeroporto(distanzaAttuale);
	     System.out.println("Blink! "  +a);	
		}		
		a.setStato(a.getStato().ATTERRATO);
		System.out.println("\n" +"Aereo atterrato: " +a+ "\n");
		
		for(Passeggero p: a.getPasseggeri()) {
			this.checkout(p);
		}
		
		return a;
	}
	
	public Passeggero checkout(Passeggero p) {
	
		System.out.println("Checkout: " +p );
		if(p instanceof Excelsior) {
			((Excelsior) p).setHaChampagne(true);
				System.out.println("Un champagne");
			} else if(p instanceof Business) {
				((Business) p).setHaGiornale(true);
				System.out.println("Un giornale");
			} else if(p.getMF()=='F') {
				System.out.println("Un fiore");
			}
		
		return p;
	}
	
	public Passeggero checkin(Passeggero p) {
		
		System.out.println("Checkin: " +p);
		
			if(p instanceof Excelsior) {
				((Excelsior) p).setHaChampagne(true);
					System.out.println("Un champagne");
				} else if(p instanceof Business) {
					((Business) p).setHaGiornale(true);
					System.out.println("Un giornale");
				} else if(p.getMF()=='F') {
					System.out.println("Un fiore");
				}

		return p;
	}
	
}
