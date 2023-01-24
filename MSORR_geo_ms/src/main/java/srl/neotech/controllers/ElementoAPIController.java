package srl.neotech.controllers;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
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


//APIREST
@RestController
@Validated
public class ElementoAPIController {


	@Autowired
	ElementoService elementoService;
	
	
	@ResponseBody
	@GetMapping(value = "/getCountElementi",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase getCountElementi() {
	    //inizializzo la response
		ResponseBase response=new ResponseBase();
		
	    try {
	    //chiamo il service	
	    int numElementi=elementoService.countElementi();
	    
	    //preparo la response
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
	@GetMapping(value = "/getElemento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetElementoResponse getElemento(@PathVariable("id") @Min(5) Integer idElemento) {
		 //inizializzo la response
		GetElementoResponse response=new GetElementoResponse();
		
		
		try {
			//chiamo il service
			Elemento elemento= elementoService.getElemento(idElemento);
			
			//preparo la response
			response.setElemento(elemento);
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
	@GetMapping(value = "/getListaElementi",produces = MediaType.APPLICATION_JSON_VALUE)
	public GetListaElementiResponse getListaElementi() {
		
		//inizializzo la response
		GetListaElementiResponse response=new GetListaElementiResponse();
		
		try {
			//chiamo il service
			ArrayList<Elemento> listaElementi = elementoService.getListaelementi();
			
			//preparo la response
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
	@PostMapping(value = "/addElemento",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addElemento(@Valid @RequestBody RequestAddElemento dati) {
		 //inizializzo la response
		ResponseBase response=new ResponseBase();
		
		
		try {
			//chiamo il service
		    elementoService.addElemento(dati);
		    
		    //rispondo
		    response.setCode("OK");
		}
		catch(Exception ex) {
		   response.setCode("KO");	
		   response.setDescr(ex.getMessage());
		   
		}
		return response;
	}


	@ResponseBody
	@DeleteMapping(value = "/delElemento/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase delElemento(@PathVariable("id") Integer idElemento) {
		
		//fase 1: inizializzo la response
		ResponseBase response=new ResponseBase();
		
		try {
			//chiamo il service
		    elementoService.deleteElemento(idElemento);
		    //rispondo
		  response.setCode("OK");
		}
		catch(Exception ex) {
			response.setCode("KO");
			response.setDescr(ex.getMessage());
		}
		return response;
		
		
	}
	
	
}
