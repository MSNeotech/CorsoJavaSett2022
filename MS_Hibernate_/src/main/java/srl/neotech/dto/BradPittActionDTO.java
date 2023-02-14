package srl.neotech.dto;

public class BradPittActionDTO {

	private Integer id;
    private String title;
    private String personName;
    
    
    
	
	public BradPittActionDTO(Integer id, String title, String personName) {
		super();
		this.id = id;
		this.title = title;
		this.personName = personName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
    
   
	

	
    
    
}
