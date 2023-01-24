package srl.neotech.requestresponse;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class RequestAddElemento {
	
	@Min(5)
	private Integer id;
	
	@NotBlank
	private String descrizione;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	

}
