package srl.neotech.dto;

public class PersonaggioDTO{

	private Integer id;
	private String personName;
	private String characterName;
	

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
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public PersonaggioDTO() {
		
	}
	public PersonaggioDTO(Integer id, String personName, String characterName) {
		super();
		this.id = id;
		this.personName = personName;
		this.characterName = characterName;
	}
	
	
	
	
	
	
	
	
	
	
}
