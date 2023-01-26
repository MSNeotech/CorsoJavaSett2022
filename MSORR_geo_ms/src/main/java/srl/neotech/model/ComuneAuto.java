package srl.neotech.model;

public class ComuneAuto {

	private String label;
	private String value;
	private String id;
	
	public ComuneAuto(String label, String value, String istat) {
		super();
		this.label = label;
		this.value = value;
		this.id = istat;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
