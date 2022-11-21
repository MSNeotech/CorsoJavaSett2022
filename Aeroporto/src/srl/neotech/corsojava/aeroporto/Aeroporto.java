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
		Integer distanzaAttuale= a.getDistanzaDallAeroporto()+ a.getVelocità();
		a.setDistanzaDallAeroporto(distanzaAttuale);
		 System.out.println("Blink");	
		}
		System.out.println("Aereo " +a.getIdUnivoco() + " è fuori dallo spazio aereo");
		a.setStato(a.getStato().FUORI_SPAZIO_AEREO);
		
		return a;
	}
	
	public Aereo atterraggio(Aereo a) {
		
		while(a.getDistanzaDallAeroporto()>0) {
	     System.out.println("Aereo si sta avvicinando" + a.getIdUnivoco());
	     Integer distanzaAttuale= a.getDistanzaDallAeroporto()- a.getVelocità();
	     a.setDistanzaDallAeroporto(distanzaAttuale);
	     System.out.println("Blink");	
		}
		System.out.println("Aereo " +a.getIdUnivoco() + " è atterrato");
		a.setStato(a.getStato().ATTERRATO);
		
		for(Passeggero p: a.getPasseggeri())
			this.checkout(p);
		
		return a;
	}
	
	public Passeggero checkout(Passeggero p) {
	
		if(p instanceof Excelsior) {
			((Excelsior) p).setHaChampagne(true);
				System.out.println("Un champagne");
			} else if(p instanceof Business) {
				((Business) p).setHaGiornale(true);
				System.out.println("Un giornale");
			} else if(p.getMF()=='F') {
				System.out.println("Un fiore");
			}
		System.out.println("Checkout aereo: " +p.getIdUnivoco());
		
		return p;
	}
	
	public Aereo checkin(Aereo a,Passeggero p) {
		
		System.out.println("Checkin: " +p);
		/*
			if(p instanceof Excelsior) {
				((Excelsior) p).setHaChampagne(true);
					System.out.println("Un champagne");
				} else if(p instanceof Business) {
					((Business) p).setHaGiornale(true);
					System.out.println("Un giornale");
				} else if(p.getMF()=='F') {
					System.out.println("Un fiore");
				}
		
			
		 System.out.println("Passeggeri totali: " +p.getIdUnivoco());
		 a.getPasseggeri().add(p);
			
	     if(a.getPasseggeri().size()<a.getModello().getModello().getCapienzaNumPasseggeri()) break;
	     
		}*/

		return a;
	}
	
}
