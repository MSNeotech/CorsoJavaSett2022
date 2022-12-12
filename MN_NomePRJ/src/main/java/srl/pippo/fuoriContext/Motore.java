package srl.pippo.fuoriContext;

import org.springframework.stereotype.Component;

@Component
public class Motore {
	private Integer cilindrata;

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	

}
