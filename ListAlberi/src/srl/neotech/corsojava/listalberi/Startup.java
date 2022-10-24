package srl.neotech.corsojava.listalberi;

import java.util.ArrayList;

public class Startup {

	static ArrayList<Albero> alberi = new ArrayList<Albero>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=200; i++) {
			Albero alb = new Albero();
			alberi.add(alb);
			
			if(i%2!=0) {
				alb.altezza=50;
				
			} if(i==170){
				alb.altezza=400;
				
			}
			
		}
	
		
		
		
		
		
		
	}

}
