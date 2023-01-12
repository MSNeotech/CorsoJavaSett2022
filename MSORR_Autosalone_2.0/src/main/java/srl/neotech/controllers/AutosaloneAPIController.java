package srl.neotech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Automobile;
import srl.neotech.requestresponse.GetListaAutoResponse;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.AutosaloneService;

@RestController
public class AutosaloneAPIController {

	@Autowired
	AutosaloneService salone;
	
	
	@ResponseBody
	@GetMapping(value = "/getListaAuto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getCountElementi() {
	    //inizializzo la response
		GetListaAutoResponse response=new GetListaAutoResponse();
	    try {
	    //chiamo il service	
	    ArrayList<Automobile> listaAuto = salone.getListaAuto();
	    
	    //preparo la response
	    response.setListaAuto(listaAuto);
	    response.setCode("OK");
	    }
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
}
