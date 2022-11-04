package srl.neotech.corsojava.fabbricadibibite;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		Cantina c = new Cantina();
		c.setThreshold(45);
		
		for(int i=1; i<=100;i++) {
			
		Cisterna cisternaAdd = new Cisterna();
			
		int num = r.nextInt(1,4);
		
		if(num==1) cisternaAdd.setTipo(Tipologia.ALLUMINIO.toString());
		else if(num==2) cisternaAdd.setTipo(Tipologia.RAME.toString());
		else cisternaAdd.setTipo(Tipologia.ACCIAIO.toString());
		
		int numQt = r.nextInt(0,1001);
		cisternaAdd.setQuantita(numQt);
		
		int numEv = r.nextInt(0,101);
		cisternaAdd.setEvapPerDay(numEv);
		
		int numGas = r.nextInt(0,101);
		cisternaAdd.setLivelloGas(numGas);
		
		c.getCisterne().add(cisternaAdd);	
	}
		
		for(Cisterna cist: c.getCisterne()) {
			System.out.println(cist);
			
		Integer qtBibita=0;
		
		if(cist.getLivelloGas()>c.getThreshold()) {
			
			qtBibita= qtBibita +cist.getQuantita();
			System.out.println("\n" + "La quantità di bibita vendibile: " +qtBibita + "\n");
			
			cist.setLivelloGas((cist.getLivelloGas()-cist.getEvapPerDay())*7);
			System.out.println("\n"+ "Quantità vendibile entro 7 giorni: " +qtBibita + "\n");
			
			Integer giorni=0;
			while(qtBibita>0) {
				giorni++;
				for(int i=1; i<=100;i++) {
					if(cist.getLivelloGas()>c.getThreshold()){
						qtBibita=qtBibita+cist.getQuantita();
						cist.setLivelloGas(cist.getLivelloGas()-cist.getEvapPerDay());
				}
					
				}
			}
			System.out.println("\n"+ "Numero giorni in cui non è vendibile nessuna bibita: "+giorni + "\n");	
		}
		
		
		}

		}

		}
			
		

