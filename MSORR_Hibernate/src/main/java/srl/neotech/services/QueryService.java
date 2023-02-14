package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ActorDepartmentDAO;
import srl.neotech.dao.MovieBradPittActionDAO;
import srl.neotech.dao.MovieBradPittDAO;
import srl.neotech.dto.ActorDepartmentDTO;
import srl.neotech.dto.MovieBradPittActionDTO;
import srl.neotech.dto.MovieBradPittDTO;
import srl.neotech.entity.ActorDepartmentEntity;
import srl.neotech.entity.MovieBradPittActionEntity;
import srl.neotech.entity.MovieBradPittEntity;

@Service
public class QueryService {

	@Autowired
	MovieBradPittDAO query1;

	@Autowired
	MovieBradPittActionDAO query2;

	@Autowired
	ActorDepartmentDAO query3;
	/*
	 * @Autowired CProduzioneBudgetDAO query4;
	 * 
	 * @Autowired AttoriLinguaDAO query5;
	 * 
	 * @Autowired AttoriCastDAO query6;
	 */

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
			ActorDepartmentDTO dto = new ActorDepartmentDTO(entity.personName(), entity.departmentName());
			actorDep.add(dto);
		}

		return actorDep;
	}

}
