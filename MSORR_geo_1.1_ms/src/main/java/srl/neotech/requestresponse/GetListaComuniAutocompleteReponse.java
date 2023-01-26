package srl.neotech.requestresponse;

import java.util.List;

import srl.neotech.model.ComuneAuto;

public class GetListaComuniAutocompleteReponse extends ResponseBase {

	private List<ComuneAuto> nomiComuni;

	public List<ComuneAuto> getNomiComuni() {
		return nomiComuni;
	}

	public void setNomiComuni(List<ComuneAuto> nomiComuni) {
		this.nomiComuni = nomiComuni;
	}
}
