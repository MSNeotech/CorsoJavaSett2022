package srl.neotech.corsojava.fruttialbero;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Albero alberoJacob = new Albero();
		Albero alberoAnna = new Albero();
		
		alberoJacob.isFruttifero=false;
		alberoAnna.isFruttifero=true;
		
		alberoJacob.altezza=3;
		alberoAnna.altezza=5;
		
		alberoJacob.diametro=5;
		alberoAnna.diametro=3;
		
		alberoJacob.eta=20;
		alberoAnna.eta=5;
		
		System.out.println("L'albero di Jacob è raccoglibile? " + alberoJacob.Raccolta());
		System.out.println("L albero di Anna è raccoglibile? " + alberoAnna.Raccolta());
		System.out.println("L'albero di Jacob ha un diametro di " + alberoJacob.diametro + " e ha l'età di " + alberoJacob.eta + " anni");
		System.out.println("L'albero di Anna ha un diametro di " + alberoAnna.diametro + " e ha l'età di " + alberoAnna.eta + " anni");
		
	}

}
