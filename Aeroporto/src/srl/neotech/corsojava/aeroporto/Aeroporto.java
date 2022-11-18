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
		while(a.getDistanzaDallAeroporto()<a.getRaggioDiAzione()) {
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
		
		return a;
	}
	
	public Aereo checkout(Aereo a) {
		System.out.println("Checkout aereo: " +a.getIdUnivoco());
		
		for(int i=1; i<a.getModello().getCapienzaNumPasseggeri();i++) {
			
			Passeggero p = new Passeggero();
			
			p.getEta();
			p.getMF();
			
			System.out.println("Passeggero" + p.getIdUnivoco()+ " è sbarcato");
		}
		return a;
	}
	
	public Aereo checkin(Aereo a,Passeggero p) {
		
		System.out.println("Checkin: " +p);
		
		for(int i=1; i<a.getModello().getCapienzaNumPasseggeri();i++) {
			
			if(p instanceof Excelsior) {
				((Excelsior) p).setHaChampagne(true);
					System.out.println("Un champagne");
				} else if(p instanceof Business) {
					((Business) p).setHaGiornale(true);
					System.out.println("Un giornale");
				} else if(p.getMF()=='F') {
					System.out.println("Un fiore");
				}
		
			System.out.println("Passeggero " + p.getIdUnivoco() + " è imbarcato");
			
		 System.out.println("Passeggeri totali: " +p.getIdUnivoco());
		 a.getPasseggeri().add(p);
			
	     if(a.getPasseggeri().size()<a.getModello().getModello().getCapienzaNumPasseggeri()) break;
	     
		
		}

		return a;
	}
	
}
