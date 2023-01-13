package srl.neotech.requestresponse;

import srl.neotech.model.Automobile;

public class GetAutoResponse extends ResponseBase {

private Automobile auto;

public Automobile getAuto() {
	return auto;
}

public void setAuto(Automobile auto) {
	this.auto = auto;
}
	
	
}
