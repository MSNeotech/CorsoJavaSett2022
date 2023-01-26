package srl.neotech.requestresponse;

import java.util.List;

import srl.neotech.model.Comune;

public class GetListaComuniResponse extends ResponseBase {

	private List<Comune> comuni;

	public List<Comune> getComuni() {
		return comuni;
	}

	public void setComuni(List<Comune> comuni) {
		this.comuni = comuni;
	}
}
