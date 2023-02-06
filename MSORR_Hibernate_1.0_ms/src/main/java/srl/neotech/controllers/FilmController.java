package srl.neotech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srl.neotech.model.Film;
import srl.neotech.model.Persona;
import srl.neotech.model.ProdCompany;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.FilmService;

@RestController
public class FilmController {

	@Autowired
	FilmService filmService;
	
	@GetMapping("/getFilm")
	public ResponseBase getFilm(@RequestParam("film_id") Integer film_id) {
		ResponseBase response=new ResponseBase();
		
		try {
			Film film_trovato=filmService.getFilm(film_id);
			response.setSimpleData(film_trovato);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}
	
	
	@GetMapping("/getFilmByActor")
	public ResponseBase getFilmByActor(@RequestParam("name") String name) {
		ResponseBase response=new ResponseBase();
		
		try {
			List<Film> films=filmService.getFilmByActor(name);
			response.setSimpleData(films);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
	return response;
	}

	
	
	
	@GetMapping("insertMovie")
	public ResponseBase insertMovie(@RequestParam("film_id") Integer film_id, @RequestParam("titolo") String titolo) {
		ResponseBase response=new ResponseBase();
		
		try {
			Film f=new Film();
			f.setId(film_id);
			f.setTitle(titolo);
			filmService.insertFilm(f);
			response.setCode("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setCode("KO");
			response.setDescr(e.getMessage());
		}
		
		return response;
	}
	
	@GetMapping("/getPerson")
	public ResponseBase getPerson(@RequestParam("person_Id") Integer person_Id) {
		
		ResponseBase response = new ResponseBase();
		
		try {
			Persona p = filmService.getPersona(person_Id);
			response.setSimpleData(p);
			response.setCode("Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		
		
		return response;
	}
	
	@GetMapping("/getProductionCompany")
	public ResponseBase getProductionCompany(@RequestParam("azienda_Id") Integer azienda_Id) {
		
        ResponseBase response = new ResponseBase();
		
		try {
			ProdCompany p = filmService.getProductionCompany(azienda_Id);
			response.setSimpleData(p);
			response.setCode("Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		
		
		return response;
	}
	
	@PutMapping("/insertPerson")
	public ResponseBase insertPerson(@RequestParam("person_Id") Integer person_Id, @RequestParam("person_Name") String name, @RequestParam("override") Boolean override) {
		
		ResponseBase response = new ResponseBase();
		
		try {
			Persona p = new Persona();
			p.setId(person_Id);
			p.setPersonName(name);
			
			 if (override) {
		            filmService.insertPersona(p);
		        } else {
		            filmService.mergePersona(p);
		        }
			response.setSimpleData(p);
			response.setCode("Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		
		
		return response;
	}
	
	@PutMapping("/insertProduction")
	public ResponseBase insertProduction(@RequestParam("company_Id") Integer company_Id, @RequestParam("company_Name") String name, @RequestParam("override") Boolean override) {
		
		ResponseBase response = new ResponseBase();
		
		try {
			ProdCompany p = new ProdCompany();
			p.setId(company_Id);
			p.setCompanyName(name);
			
			if (override) {
				filmService.insertCompany(p);
	        } else {
	            filmService.mergeCompany(p);
	        }
			
			response.setSimpleData(p);
			response.setCode("Ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setCode("KO");
		}
		
		
		return response;
	}
	
}