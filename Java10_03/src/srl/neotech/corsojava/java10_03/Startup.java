package srl.neotech.corsojava.java10_03;

import java.util.ArrayList;
import java.util.Random;

public class Startup {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Arraynum = new ArrayList<Integer>();
	    Random r = new Random();
	
	     for(int i=0; i<10;i++) {
	    	 int num = r.nextInt(101-9)-9;
	    	 Arraynum.add(num);
	}
	     System.out.println(Arraynum);
	     for(int numero: Arraynum) System.out.println(numero);

}
}
