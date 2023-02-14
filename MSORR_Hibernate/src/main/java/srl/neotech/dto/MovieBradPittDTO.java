package srl.neotech.dto;

public class MovieBradPittDTO {

	private String personName;
	private String title;
	
	
	
	public MovieBradPittDTO(String personName, String title) {
		super();
		this.personName = personName;
		this.title = title;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
