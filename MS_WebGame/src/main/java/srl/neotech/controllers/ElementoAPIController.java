package srl.neotech.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Elemento;
import srl.neotech.requestresponse.GetElementoResponse;
import srl.neotech.requestresponse.GetListaElementiResponse;
import srl.neotech.requestresponse.RequestAddElemento;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.ElementoService;

@RestController
public class ElementoAPIController {


	@Autowired
	ElementoService elementoService;
	
	
	@ResponseBody
	@GetMapping(value = "/api/getCountElementi",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getCountElementi() {
	    ResponseBase response=new ResponseBase();
	    try {
	    int numElementi=elementoService.countElementi();
	    response.setSimpleData(numElementi);
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
	
	@ResponseBody
	@GetMapping(value = "/api/getElemento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetElementoResponse getElemento(@PathVariable("id") Integer idElemento) {
	    GetElementoResponse response=new GetElementoResponse();
		try {
			Elemento elemento= elementoService.getElemento(idElemento);
			response.setElemento(elemento);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}
	
	@ResponseBody
	@GetMapping(value = "/api/getListaElementi",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaElementiResponse getListaElementi() {
		GetListaElementiResponse response=new GetListaElementiResponse();
		try {
			ArrayList<Elemento> listaElementi = elementoService.getListaelementi();
			response.setElementi(listaElementi);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		return response;
	}

	@ResponseBody
	@PostMapping(value = "/api/addElemento",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addElemento(@RequestBody RequestAddElemento dati) {
		ResponseBase response=new ResponseBase();
		try {
			Elemento elemento=new Elemento(dati.getId(), dati.getDescrizione());
		    elementoService.addElemento(elemento);
		    response.setCode("OK");
		}
		catch(Exception ex) {
		   response.setCode("KO");	
		}
		return response;
	}


	@ResponseBody
	@PostMapping(value = "/api/delElemento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase delElemento(@PathVariable("id") Integer idElemento) {
		ResponseBase response=new ResponseBase();
		try {
		elementoService.deleteElemento(idElemento);
		response.setCode("OK");
		}
		catch(Exception ex) {
			response.setCode("KO");
		}
		return response;
	}
	
	
}
