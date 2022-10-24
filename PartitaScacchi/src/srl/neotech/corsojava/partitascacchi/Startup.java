package srl.neotech.corsojava.partitascacchi;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Giocatore g1 = new Giocatore();
	Giocatore g2 = new Giocatore();
	Tavolo t =new Tavolo();
	
	g1.setNome("Marco");
	g1.setAnni(20);
	g1.setLivelloAbilità(3);
	
	
	g2.setNome("Luca");
	g2.setAnni(18);
	g2.setLivelloAbilità(5);
	
	for(int i=0;i<64;i++) {
		Cella c = new Cella();
		if(i%2==0) c.setColore("Bianco");
		else       c.setColore("Nero");
		if(i<15) {
			Pezzo pezzo = null;
		switch (i){
			case 0:
				pezzo = new Torre();
				c.setPezzo(pezzo);
				break;
			case 1:
				pezzo = new Pedone();
				c.setPezzo(pezzo);
				break;
			default:
				pezzo = new Re();
				c.setPezzo(pezzo);
				break;
			
		}
		} 
		t.getCelle().add(c);
		
	}
	for(Cella cellaSullaScacchiera: t.getCelle()) {
		if(cellaSullaScacchiera.getPezzo() instanceof Torre) System.out.println("Ce una torre");
		if(cellaSullaScacchiera.getPezzo() instanceof Re) System.out.println("Ce una Re");
		if(cellaSullaScacchiera.getPezzo() instanceof Regina) System.out.println("Ce una Regina");
		if(cellaSullaScacchiera.getPezzo() instanceof Pedone) System.out.println("Ce un pedone");
	}
	
	}
	
}