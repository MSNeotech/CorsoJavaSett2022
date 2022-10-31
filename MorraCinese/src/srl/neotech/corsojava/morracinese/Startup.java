package srl.neotech.corsojava.morracinese;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String g1;
		String g2;
		
		Random r = new Random();
		
		int random = r.nextInt(3-1)+1;
		
		switch(random) {
		
		case 1:
			g1 = "Forbice";
			g2 = "Carta";
			
		case 2: 
			g1 = "Carta";
			g2 = "Sasso";
			
		case 3:
			g1= "Sasso";
			g2 = "Forbice";	
		
			
		}
		

	}

}
