package srl.neotech.giochi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gioco {

	@Autowired
	private Engine en;

	public Engine getEn() {
		return en;
	}

	public void setEn(Engine en) {
		this.en = en;
	}
	
	
}
