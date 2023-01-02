package srl.neotech.model;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Autosalone {

	private ArrayList<Automobile> automobili=new ArrayList<Automobile>();
	
	
	//Verrà chiamato da Spring, quando verrà avviata l'applicazione,  perchè è un Bean Component
	public Autosalone() {
		//popolare la lista delle autos...
		Automobile primaAuto=new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));
		
	    Accessorio cerchiLega=new Accessorio();
	    cerchiLega.setId("1");
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));
		
		   Automobile secondaAuto = new Automobile();
		   secondaAuto.setId("2");
	       secondaAuto.setTarga("GL230GH");
	       secondaAuto.setColore(EColore.NERO);
	       secondaAuto.setAlimentazione(EAlimentazione.BENZINA);
	       secondaAuto.setAnnoCostruzione("2022");
	       secondaAuto.setCostruttore(ECostruttore.FERRARI);
	       secondaAuto.setModello("Roma");
	       secondaAuto.setCosto(new BigDecimal("300009.50"));
	       
	       Automobile terzaAuto = new Automobile();

	        terzaAuto.setId("3");
	        terzaAuto.setTarga("GL228GH");
	        terzaAuto.setColore(EColore.ROSSO);
	        terzaAuto.setAlimentazione(EAlimentazione.BENZINA);
	        terzaAuto.setAnnoCostruzione("2022");
	        terzaAuto.setCostruttore(ECostruttore.LAMBORGHINI);
	        terzaAuto.setModello("Huracan");
	        terzaAuto.setCosto(new BigDecimal("400009.50"));
	        
	        Automobile quartaAuto = new Automobile();
	        
	        quartaAuto.setId("4");
	        quartaAuto.setTarga("GL230GE");
	        quartaAuto.setColore(EColore.NERO);
	        quartaAuto.setAlimentazione(EAlimentazione.BENZINA);
	        quartaAuto.setAnnoCostruzione("2022");
	        quartaAuto.setCostruttore(ECostruttore.MASERATI);
	        quartaAuto.setModello("MC20");
	        quartaAuto.setCosto(new BigDecimal("500009.50"));

	        primaAuto.getAccessori().add(cerchiLega);
	        automobili.add(primaAuto);
	        automobili.add(secondaAuto);
	        automobili.add(terzaAuto);
	        automobili.add(quartaAuto);
		
	
	}

	
	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	public Automobile getAutomobileById(String id) {
		
		   for(Automobile auto: automobili) {
		
			   if(auto.getId().equals(id)) {
				   return auto;
			   }
		   }
		   return null;

}

	
}
