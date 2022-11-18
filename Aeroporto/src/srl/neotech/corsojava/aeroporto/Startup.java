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
		
	Aeroporto a = new Aeroporto();
	
	Random rnd = new Random();
	
	Faker f = new Faker();
	
	a.setRaggioDiAzione(100);
	
	for(int i=1; i<=300;i++) {
		
		Aereo a1 = new Aereo();
		
		Integer randomVelocità = rnd.nextInt(0,10);
		Integer randomDistanzaAereoporto =rnd.nextInt(1,500);
		Integer randomOrario = rnd.nextInt(1,200);
		
		String compagnia = f.company().name();
		Integer IdUnivoco = f.number().randomDigit();
		
		if(i<100) {
			
			a1.setCompagniaAerea(compagnia);
			a1.setIdUnivoco(IdUnivoco);
			a1.setDistanzaDallAeroporto(randomDistanzaAereoporto);
			a1.setVelocità(randomVelocità);
			a1.setOrario(0);
			
		    a1.setStato(a1.getStato().IN_PARTENZA);
		    
		    aereiInPartenza.add(a1);
		    
		} else if(i>100){
			
			a1.setStato(a1.getStato().IN_AVVICINAMENTO);
			
			a1.setIdUnivoco(IdUnivoco);
			a1.setOrario(randomOrario);
			a1.setCompagniaAerea(compagnia);
			a1.setVelocità(randomVelocità);
			a1.setDistanzaDallAeroporto(randomDistanzaAereoporto);
			
			aereiInAvvicinamento.add(a1);
		} 
		
		
	} for(int k=1; k<=1000;k++) {
		
		Passeggero p = new Passeggero();
		
		Integer tipo = rnd.nextInt(1,3);
		
		String nome = f.funnyName().name();
		Integer IdUnivoco = f.number().randomDigit();
		Integer eta = f.number().numberBetween(3, 90);
		
		p.setEta(eta);
		p.setIdUnivoco(IdUnivoco);
		
		if(tipo==1) p = new Business();
		else if(tipo==2) p = new Turista();
		else p = new Excelsior();
		
		p.setIdUnivoco(k);
		
		a.getPasseggeri().add(p);
		
	}
	System.out.println("\n"+"In Partenza" + "\n");
	
	for(Aereo aereoInPartenza: aereiInPartenza) {
		System.out.println(aereoInPartenza);
	}	
	System.out.println("\n"+"In Arrivo"+ "\n");
	
	for(Aereo aereoInArrivo: aereiInAvvicinamento) {
		System.out.println(aereoInArrivo);
	}


}
}
