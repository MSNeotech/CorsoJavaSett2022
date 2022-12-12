package srl.pippo.fuoriContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Automobile {
	
	@Autowired //voglio usare..
	private Motore motore;
	

	public Motore getMotore() {
		return motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}

}
