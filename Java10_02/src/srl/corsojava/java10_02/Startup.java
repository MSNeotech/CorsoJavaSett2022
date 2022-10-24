package srl.corsojava.java10_02;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int num= r.nextInt(10-1)+1;
		
		while(num%3==0) {
			num=r.nextInt(10-1)+1;
			System.out.println(num);
		}
		System.out.println("Fine ciclo");	
		
}     
}
