package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.MeteoRepository;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Component
public class MeteoDAO {
	
	@Autowired
	MeteoRepository meteoRepository;
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		return meteoRepository.getListaProvince(id_regione);
	}
	
    public List<Regione> getListaRegioni(){
		
		return meteoRepository.getListaRegioni();
	}
    

    public List<Comune> getListaComuni(String sigla){
		
		return meteoRepository.getListaComuni(sigla);
	}
    

    public List<ComuneAuto> getListaComuniAuto(String text) {
		return meteoRepository.getListaComuniAuto(text);
	}
}
