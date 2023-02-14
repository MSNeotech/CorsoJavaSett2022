package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.QueryService;

@RestController
public class QueryController {

	@Autowired
	QueryService service;
	
	@GetMapping("/getQuery")
	public ResponseBase getFilm(@RequestParam("num") Integer num) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<Object> query = service.switchQuery(num);
			response.setSimpleData(query);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
}
