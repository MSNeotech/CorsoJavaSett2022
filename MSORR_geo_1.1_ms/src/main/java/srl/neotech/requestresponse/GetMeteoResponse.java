package srl.neotech.requestresponse;

import java.util.List;

import srl.neotech.model.Comune;
import srl.neotech.model.MeteoGiornaliero;

public class GetMeteoResponse extends ResponseBase {

	private List<MeteoGiornaliero> previsioni;

	public List<MeteoGiornaliero> getPrevisioni() {
		return previsioni;
	}

	public void setPrevisioni(List<MeteoGiornaliero> previsioni) {
		this.previsioni = previsioni;
	}
	
	
	
	
}
