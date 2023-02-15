package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ActorDepartmentDAO;
import srl.neotech.dao.MovieBradPittActionDAO;
import srl.neotech.dao.MovieBradPittDAO;
import srl.neotech.dao.PersonCastDAO;
import srl.neotech.dao.PersonLanguageDAO;
import srl.neotech.dao.ProductionBudgetDAO;
import srl.neotech.dto.ActorDepartmentDTO;
import srl.neotech.dto.MovieBradPittActionDTO;
import srl.neotech.dto.MovieBradPittDTO;
import srl.neotech.dto.PersonCastDTO;
import srl.neotech.dto.PersonLanguageDTO;
import srl.neotech.dto.ProductionBudgetDTO;
import srl.neotech.entity.ActorDepartmentEntity;
import srl.neotech.entity.MovieBradPittActionEntity;
import srl.neotech.entity.MovieBradPittEntity;
import srl.neotech.entity.Person;
import srl.neotech.entity.PersonLanguageEntity;
import srl.neotech.entity.ProductionBudgetEntity;

@Service
public class QueryService {

	@Autowired
	MovieBradPittDAO query1;

	@Autowired
	MovieBradPittActionDAO query2;

	@Autowired
	ActorDepartmentDAO query3;
	
    @Autowired 
    ProductionBudgetDAO query4;
	  
	@Autowired
	PersonLanguageDAO query5;
	  
   @Autowired 
   PersonCastDAO query6;
   
   @Autowired
   ModelMapper model;
	 

	public List<Object> switchQuery(Integer numero) {
		List<Object> result = new ArrayList<>();
		switch (numero) {
		case 1:
			result.add(getBradPitt("Brad Pitt"));
			break;
		case 2:
			result.add(getBradPittAction("Brad Pitt", "Action"));
			break;
		case 3:
			result.add(getActorDepartment("Production", "Directing"));
			break;
		case 4: 
			result.add(getProductionBudget(300000));
			break;
		case 5: 
			result.add(getPersonLanguage("Italiano"));
			break;
		case 6:
			result.add(getPersonCast());
			break;
		}

		return result;
	}

	private List<MovieBradPittDTO> getBradPitt(String name) {
		List<MovieBradPittDTO> movieDTO = new ArrayList<>();
		List<MovieBradPittEntity> movies = query1.getBradPitt(name);
		for (MovieBradPittEntity movie : movies) {
			MovieBradPittDTO moviePitt = new MovieBradPittDTO(movie.getPersonName(), movie.getTitle());
			movieDTO.add(moviePitt);
		}
		return movieDTO;
	}

	private List<MovieBradPittActionDTO> getBradPittAction(String name, String gen) {
		List<MovieBradPittActionDTO> movieDTO = new ArrayList<>();
		List<MovieBradPittActionEntity> movies = query2.getBradPittAction(name, gen);
		for (MovieBradPittActionEntity movie : movies) {
			MovieBradPittActionDTO moviePitt = new MovieBradPittActionDTO(movie.getId(), movie.getTitle());
			movieDTO.add(moviePitt);
		}
		return movieDTO;
	}

	private List<ActorDepartmentDTO> getActorDepartment(String depName1, String depName2) {
		List<ActorDepartmentDTO> actorDep = new ArrayList<>();
		List<ActorDepartmentEntity> actorDepEnt = query3.getActorDepartment(depName1, depName2);
		for (ActorDepartmentEntity entity : actorDepEnt) {
			ActorDepartmentDTO dto = new ActorDepartmentDTO(entity.getPersonName(), entity.getDepartmentName());
			actorDep.add(dto);
		}

		return actorDep;
	}
	
	private List<ProductionBudgetDTO> getProductionBudget(Integer budget){
		
		List<ProductionBudgetDTO> prodDTO = new ArrayList<>();
		List<ProductionBudgetEntity> prodEntity = query4.getProductionBudget(budget);
		
		for(ProductionBudgetEntity entity: prodEntity) {
			ProductionBudgetDTO dto = new ProductionBudgetDTO(entity.getCompanyName(), entity.getTitle(), entity.getBudget());
			prodDTO.add(dto);
		}
		
		return prodDTO;
	}
	
	private List<PersonLanguageDTO> getPersonLanguage(String lang){
		
		List<PersonLanguageDTO> langDTO = new ArrayList<>();
		List<PersonLanguageEntity> langEntity = query5.getPersonLanguage(lang); 
		
		for(PersonLanguageEntity entity: langEntity) {
			PersonLanguageDTO dto = new PersonLanguageDTO(entity.getId(), entity.getPersonName(), 
					                                      entity.getTitle(), entity.getLanguageName());
		    langDTO.add(dto);
		}
		return langDTO;		
	
	}
	
	
	private List<PersonCastDTO> getPersonCast()
	{
		List<Person> entity = query6.getPersonCast();
		List<PersonCastDTO> dto = new ArrayList<>();
		for(Person p: entity) {
			dto.add(model.map(p, PersonCastDTO.class));
		}
		return dto;
		
		
	}
	
	
	

}
