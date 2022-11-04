package srl.neotech.corsojava.fabbricadibibite;

import java.util.ArrayList;

public class Cantina {
	
	private ArrayList <Cisterna> cisterne = new ArrayList<Cisterna>();
	private Integer threshold;
	

	public Integer getThreshold() {
		return threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	public ArrayList<Cisterna> getCisterne() {
		return cisterne;
	}

	public void setCisterne(ArrayList<Cisterna> cisterne) {
		this.cisterne = cisterne;
	}

	

}
