package srl.neotech.requestresponse;

import java.util.List;

import srl.neotech.model.Provincia;

public class GetListaProvinceResponse extends ResponseBase {

	private List<Provincia> province;

	public List<Provincia> getProvince() {
		return province;
	}

	public void setProvince(List<Provincia> province) {
		this.province = province;
	}

	
}
