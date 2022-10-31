package srl.neotech.corsojava.morracinese;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String g1;
		String g2;
	
		Scanner ins = new Scanner(System.in);
		System.out.println("Benvenuto nel gioco della morra cinese");
		System.out.println("G1: Carta, Forbice o Sasso?");
		g1 = ins.next();
		System.out.println("G2:Carta,Forbice o Sasso?");
		g2 = ins.next();

		if((g1.equals("Sasso") && g2.equals("Forbice")) || (g1.equals("Carta") && g2.equals("Sasso")) || (g1.equals("Forbice") && g2.equals("Carta")))
		System.out.println("Vince g1");
	    else System.out.println("Vince g2");
		}
	
		
		}
		

	


