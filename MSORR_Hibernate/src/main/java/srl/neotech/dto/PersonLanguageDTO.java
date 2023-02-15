package srl.neotech.dto;

public class PersonLanguageDTO {

	private Integer id;
	private String personName;
	private String title;
	private String languageName;
	
	
	
	public PersonLanguageDTO(Integer id, String personName, String title, String languageName) {
		super();
		this.id = id;
		this.personName = personName;
		this.title = title;
		this.languageName = languageName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
}
