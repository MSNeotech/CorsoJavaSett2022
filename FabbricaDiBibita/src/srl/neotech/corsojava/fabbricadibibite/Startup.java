package srl.neotech.corsojava.fabbricadibibite;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		Cantina c = new Cantina();
		
		for(int i=1; i<=100;i++) {
			
		Cisterna cisternaAdd = new Cisterna();
			
		int num = r.nextInt(3-1)+1;
		
		if(num==1) cisternaAdd.setTipo("Alluminio");
		else if(num==2) cisternaAdd.setTipo("Rame");
		else if(num==3) cisternaAdd.setTipo("Acciaio");
		
		int numQt = r.nextInt(1000-1)+1;
		cisternaAdd.setQuantita(numQt);
		
		int numEv = r.nextInt(100-1)+1;
		cisternaAdd.setEvapPerDay(numEv);
		
		int numGas = r.nextInt(100-1)+1;
		cisternaAdd.setLivelloGas(numGas);
		
		c.getCisterne().add(cisternaAdd);
		
		System.out.println("Cantina n: " + i);
		System.out.println("\n");
		

	}

}
}
