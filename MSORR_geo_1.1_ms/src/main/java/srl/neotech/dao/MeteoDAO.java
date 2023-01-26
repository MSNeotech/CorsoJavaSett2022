package srl.neotech.dao;

import java.util.ArrayList;
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
	
	 public List<Regione> getListaRegioni(){
		    List<Regione> listaRegioni=meteoRepository.getListaRegioni();
			List<Regione>addlistaRegioni=new ArrayList<Regione>();
			addlistaRegioni.addAll(listaRegioni);
			return addlistaRegioni;
		}
	    
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		List<Provincia> listaProvince=meteoRepository.getListaProvince(id_regione);
		List<Provincia>addListaProvince=new ArrayList<Provincia>();
		addListaProvince.addAll(listaProvince);
		return addListaProvince;
	}
	

    public List<Comune> getListaComuni(String sigla){
    	List<Comune> listaComuni=meteoRepository.getListaComuni(sigla);
		List<Comune>addListaComuni=new ArrayList<Comune>();
		addListaComuni.addAll(listaComuni);
		return addListaComuni;	
		}
    

    public List<ComuneAuto> getListaComuniAuto(String text) {
    	List<ComuneAuto> listaComuni=meteoRepository.getListaComuniAuto(text);
		List<ComuneAuto>addlistaComuni=new ArrayList<ComuneAuto>();
		addlistaComuni.addAll(listaComuni);
		return addlistaComuni;
	}
}
