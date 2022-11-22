package srl.neotech.corsojava.aeroporto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

public class Startup {

	static List<Aereo> aereiInPartenza = new ArrayList<Aereo>();
	static List<Aereo> aereiInAvvicinamento = new ArrayList<Aereo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Aeroporto aereoporto = new Aeroporto();
	
	Random rnd = new Random();
	
	Faker f = new Faker();
	
	aereoporto.setRaggioDiAzione(100);
	
	//Aerei in partenza
	for(int i=1; i<=100;i++) {
		
		Aereo aereoInPartenza = new Aereo();
		ModelloAereo modello = new ModelloAereo();

		aereoInPartenza.setCompagniaAerea(f.company().name());
		aereoInPartenza.setIdUnivoco(i);
		aereoInPartenza.setDistanzaDallAeroporto(1);
		aereoInPartenza.setVelocità(1);
		aereoInPartenza.setOrario(1);
			
		aereoInPartenza.setStato(aereoInPartenza.getStato().IN_PARTENZA);
		
		modello.setCostruttore(f.company().name());
		modello.setCapienzaNumPasseggeri(rnd.nextInt(1,200));
		modello.setCodiceModello(f.code().isbn13());
		aereoInPartenza.setModello(modello);
		
	    //Riempimento passeggeri in aerei in partenza
		for(int k=0; k<modello.getCapienzaNumPasseggeri();k++) {
			
			Passeggero p = null;
			
			Integer sesso = rnd.nextInt(0,1);
			Integer tipo = rnd.nextInt(1,3);
			
			if(tipo==1) p = new Business();
			else if(tipo==2) p = new Turista();
			else p = new Excelsior();
			
			if(sesso==0) p.setMF('M');
			else p.setMF('F');
			
			p.setEta(rnd.nextInt(3,90));
			p.setIdUnivoco(k);
			p.setHasFiore(false);
			p.setHaBagagli(true);
			
			
			aereoInPartenza.getPasseggeri().add(p);
			
		}
		
		aereiInPartenza.add(aereoInPartenza); 
	}
     //Aerei in avvicinamento
	for(int j=1;j<=200;j++) {
		
		Aereo aereoInAvvicinamento = new Aereo();
		ModelloAereo modello = new ModelloAereo();
			
		aereoInAvvicinamento.setStato(aereoInAvvicinamento.getStato().IN_AVVICINAMENTO);
			
		aereoInAvvicinamento.setIdUnivoco(j);
		aereoInAvvicinamento.setOrario(rnd.nextInt(1,200));
		aereoInAvvicinamento.setCompagniaAerea(f.company().name());
		aereoInAvvicinamento.setVelocità(rnd.nextInt(1,10));
		aereoInAvvicinamento.setDistanzaDallAeroporto(rnd.nextInt(0,500));
		

		modello.setCostruttore(f.company().name());
		modello.setCapienzaNumPasseggeri(rnd.nextInt(1,200));
		modello.setCodiceModello(f.code().isbn13());
		aereoInAvvicinamento.setModello(modello);
		
		//Riempimento passeggeri in aerei in avvicinamento
		for(int l=0; l<modello.getCapienzaNumPasseggeri();l++) {
			
			Passeggero p = null;
			
			Integer sesso = rnd.nextInt(0,1);
			Integer tipo = rnd.nextInt(1,3);
			
			if(tipo==1) p = new Business();
			else if(tipo==2) p = new Turista();
			else p = new Excelsior();
			
			if(sesso==0) p.setMF('M');
			else p.setMF('F');
			
			p.setEta(rnd.nextInt(3,90));
			p.setIdUnivoco(l);
			p.setHasFiore(false);
			p.setHaBagagli(true);
			
			
			aereoInAvvicinamento.getPasseggeri().add(p);
			
		}
		
		aereiInAvvicinamento.add(aereoInAvvicinamento);
		}
		// Creazione 1000 passeggeri 
	for(int m=1; m<=1000;m++) {
		
		Passeggero p = new Passeggero();
		
		Integer sesso = rnd.nextInt(0,1);
		Integer tipo = rnd.nextInt(1,3);
		
		if(tipo==1) p = new Business();
		else if(tipo==2) p = new Turista();
		else p = new Excelsior();
		
		if(sesso==0) p.setMF('M');
		else p.setMF('F');
		
		p.setEta(rnd.nextInt(3,90));
		p.setIdUnivoco(m);
		p.setHasFiore(false);
		p.setHaBagagli(true);
		
		aereoporto.getPasseggeri().add(p);
	}
	
	System.out.println("\n"+"In Partenza" + "\n");
	
	for(Aereo aereoInPartenza: aereiInPartenza) {
		System.out.println(aereoInPartenza);
	}	
	
	System.out.println("\n"+"In Arrivo"+ "\n");
	
	for(Aereo aereoInArrivo: aereiInAvvicinamento) {
		System.out.println(aereoInArrivo);	
	}
	
	System.out.println("\n"+"Aerei in decollo" + "\n");
	for(Aereo aereiInPartenza: aereiInPartenza) {
		aereoporto.decollo(aereiInPartenza);
	}
	
	System.out.println("\n"+"Aerei in atterraggio" + "\n");
	for(Aereo aereoInArrivo: aereiInAvvicinamento) {
		aereoporto.atterraggio(aereoInArrivo);
	}
	

}
}
