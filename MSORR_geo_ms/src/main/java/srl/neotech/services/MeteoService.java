package srl.neotech.services;

import java.util.List;

import org.springframework.stereotype.Service;

import srl.neotech.dao.MeteoDAO;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Service
public class MeteoService {

	MeteoDAO meteoDAO;
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		return meteoDAO.getListaProvince(id_regione);
	}
	
	public List<Regione> getListaRegioni(){
		
		return meteoDAO.getListaRegioni();
	}
	
     public List<Comune> getListaComuni(String sigla){
		
		return meteoDAO.getListaComuni(sigla);
	}
     
     public List<ComuneAuto> getListaComuniAuto(String text) {
 		return meteoDAO.getListaComuniAuto(text);
 	}
}
