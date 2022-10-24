package srl.neotech.corsojava.java10;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random();
		
		for(int i=0; i<10;i++) {
	    int num= r.nextInt(10-1)+1;
	 	if(num>=1 && num<=10) System.out.println("Numero casuale: " + num);
		}
			
	
		
		
		
		
		
		
		
		
	}

}
