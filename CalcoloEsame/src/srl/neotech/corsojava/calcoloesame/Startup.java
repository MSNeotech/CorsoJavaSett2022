package srl.neotech.corsojava.calcoloesame;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	static ArrayList<Integer> voti = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		Integer votoScritto = r.nextInt(-8,8);
		voti.add(0, votoScritto);
		Integer votoOrale= r.nextInt(0,24);
		voti.add(1,votoOrale);
		
		Integer ris = voti.get(0) + voti.get(1);
		
		System.out.println("Voto scritto: " +voti.get(0)+"\n");
		System.out.println("Voto orale: " +voti.get(1)+"\n");
		System.out.println("Risultato:" +ris +"\n");
		
		if(voti.get(0)<=0) System.out.println("Bocciato");
		else if(voti.get(0)>=18 && voti.get(1)>=18) System.out.println("Promosso");
		else if((voti.get(0)>0 && voti.get(0)<18) && ris>24) System.out.println("Promosso");
		else if(voti.get(0)==30 && voti.get(1)==30) System.out.println("Congratulazione: 30 e lode");
		else System.out.println("Rimandato");

	}

}
