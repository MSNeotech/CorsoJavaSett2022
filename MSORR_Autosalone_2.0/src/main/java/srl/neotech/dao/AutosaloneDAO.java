package srl.neotech.dao;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import srl.neotech.model.Automobile;
import srl.neotech.model.EAlimentazione;
import srl.neotech.model.EColore;
import srl.neotech.model.ECostruttore;

@Component
public class AutosaloneDAO {

	private ArrayList<Automobile> automobili = new ArrayList<Automobile>();

	// Verrà chiamato da Spring, quando verrà avviata l'applicazione, perchè è un
	// Bean Component

	public AutosaloneDAO() {
		
		
		Automobile primaAuto = new Automobile();
		primaAuto.setId("1");
		primaAuto.setTarga("BR556TY");
		primaAuto.setColore(EColore.BLU);
		primaAuto.setAlimentazione(EAlimentazione.IBRIDO);
		primaAuto.setAnnoCostruzione("2021");
		primaAuto.setCostruttore(ECostruttore.BUGATTI);
		primaAuto.setModello("Veyron");
		primaAuto.setCosto(new BigDecimal("450670.50"));

		/*Accessorio cerchiLega = new Accessorio();
		cerchiLega.setId("1");
		cerchiLega.setClasse(EClasseAccessorio.ESTERNI);
		cerchiLega.setTipologia(ETipologiaAccessorio.CERCHI);
		cerchiLega.setCosto(new BigDecimal("3700.34"));*/

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

		//primaAuto.getAccessori().add(cerchiLega);
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
}
