package srl.neotech.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.dao.repository.MeteoRepository;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Component
public class MeteoDAO {
	
	@Autowired
	MeteoRepository meteoRepository;
	
	 public List<Regione> getListaRegioni(){
		    List<Regione> listaRegioni=meteoRepository.getListaRegioni();
			return listaRegioni;
		}
	    
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		List<Provincia> listaProvince=meteoRepository.getListaProvince(id_regione);
		return listaProvince;
	}
	

    public List<Comune> getListaComuni(String sigla){
    	List<Comune> listaComuni=meteoRepository.getListaComuni(sigla);
		return listaComuni;	
		}
    

    public List<ComuneAuto> getListaComuniAuto(String text) {
    	List<ComuneAuto> listaComuni=meteoRepository.getListaComuniAuto(text);
		return listaComuni;
	}
    
    public Comune getMeteo(String istat){
   	 return meteoRepository.getMeteo(istat);
   	 
    }
}
