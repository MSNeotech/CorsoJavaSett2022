package srl.neotech.requestresponse;

import java.util.List;

import srl.neotech.model.Provincia;

public class GetListaProvinceResponse extends ResponseBase {

	private List<Provincia> province;

	public List<Provincia> getProvince() {
		return province;
	}
	public List<Provincia> setProvince(List<Provincia> province) {
		return province;
	}
}
