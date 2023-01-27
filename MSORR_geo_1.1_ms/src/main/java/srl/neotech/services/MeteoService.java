package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import srl.neotech.dao.MeteoDAO;
import srl.neotech.model.Comune;
import srl.neotech.model.ComuneAuto;
import srl.neotech.model.MeteoGiornaliero;
import srl.neotech.model.OpenMeteoRoot;
import srl.neotech.model.Provincia;
import srl.neotech.model.Regione;

@Service
public class MeteoService {

	@Autowired
	MeteoDAO meteoDAO;
	
	
	public List<Regione> getListaRegioni(){
		
		return meteoDAO.getListaRegioni();
	}
	
	public List<Provincia> getListaProvince(Integer id_regione) {
		return meteoDAO.getListaProvince(id_regione);
	}
	
     public List<Comune> getListaComuni(String sigla){
		
		return meteoDAO.getListaComuni(sigla);
	}
     
     public List<ComuneAuto> getListaComuniAuto(String text) {
 		return meteoDAO.getListaComuniAuto(text);
 	}
     
     public List<MeteoGiornaliero> getMeteo(String istat){
    	String lat="52.52";
 		String lng="13.41";
 		
 		WebClient webClient=WebClient.create("https://api.open-meteo.com/v1/forecast?latitude="+lat+"&longitude="+lng+"&timezone=CET&daily=weathercode,temperature_2m_min,temperature_2m_max,rain_sum");
 		
 		OpenMeteoRoot root=webClient.get()
 		.retrieve()
 		.bodyToMono(OpenMeteoRoot.class).block();

 		System.out.println("giorni:"+root.getDaily().getTime()+" whethercode:"+root.getDaily().getWeathercode());
 		List<MeteoGiornaliero> giorni=new ArrayList<>();
 		for(int i=0;i<root.getDaily().getTime().size();i++) {
 			MeteoGiornaliero giornoMeteo=new MeteoGiornaliero();
 			giornoMeteo.setData(root.getDaily().getTime().get(i));
 			giornoMeteo.setCodiceMeteo(root.getDaily().getWeathercode().get(i).toString());
 			giornoMeteo.setTempMin(root.getDaily().getTemperature_2m_min().get(i).toString());
 			giornoMeteo.setTempMax(root.getDaily().getTemperature_2m_max().get(i).toString());
 			giornoMeteo.setPrecipitazione(root.getDaily().getRain_sum().get(i).toString());
 			giorni.add(giornoMeteo);
 		}

 		System.out.println(giorni);
 		return giorni;
    	 
     }
}
