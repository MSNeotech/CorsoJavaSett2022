package srl.neotech.corsojava.robotagliaerba;

import java.util.ArrayList;

public class Campo {
	
	ArrayList <Striscia> strisce = new ArrayList<Striscia>();

	public ArrayList<Striscia> getStrisce() {
		return strisce;
		
	}
	public void setStrisce(ArrayList<Striscia> strisce) {
		this.strisce = strisce;
		
		for(int i=1; i<10;i++) {
			Striscia s = new Striscia();
		    s.setNumeroStriscia(i);
		    strisce.add(s);
		}
		
			
		} 
			
	}

	

