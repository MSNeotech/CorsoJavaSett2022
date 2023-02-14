package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.AttoriCastDAO;
import srl.neotech.dao.AttoriDipartimentoDAO;
import srl.neotech.dao.AttoriLinguaDAO;
import srl.neotech.dao.BradPittActionDAO;
import srl.neotech.dao.BradPittDAO;
import srl.neotech.dao.CProduzioneBudgetDAO;
import srl.neotech.dto.BradPittActionDTO;
import srl.neotech.dto.PersonDTO;
import srl.neotech.dto.PersonaggioDTO;
import srl.neotech.entity.GenereEntity;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;

@Service
public class QueryFilmService {

	@Autowired
	BradPittDAO query1;
	
	@Autowired 
	BradPittActionDAO query2;
	 /* 
	 * @Autowired AttoriDipartimentoDAO query3;
	 * 
	 * @Autowired CProduzioneBudgetDAO query4;
	 * 
	 * @Autowired AttoriLinguaDAO query5;
	 * 
	 * @Autowired AttoriCastDAO query6;
	 */

	@Autowired
	ModelMapper modelMapper;
	
	public List<Object> switchQuery(Integer numero) {
	List<Object> res = new ArrayList<>();	
	switch(numero) {
	
	case 1:
		res.addAll(getBradPitt("Brad Pitt"));
		break;
	
	
	case 2:
		res.addAll(getBradPittAction("Brad Pitt", "Action"));
		break;
		
	}
	return res;
		
	}
	
	private List<PersonDTO> getBradPitt(String name) {
		List<Person> person = query1.getBradPitt(name);
		List<PersonDTO> p=new ArrayList<>();
		for(Person p1:person) {
			p.add(modelMapper.map(p1, PersonDTO.class));
		}
		return p;
	}
	
	private List<BradPittActionDTO> getBradPittAction(String name, String gen) {
		List<BradPittActionDTO> movies = new ArrayList<>();
		List<GenereEntity> pitt= query2.getBradPittAction(name, gen);
		for(GenereEntity g:pitt) {
			BradPittActionDTO b=new BradPittActionDTO(g.getId(), g.getTitle(), g.personName());
			movies.add(b);
		}
		return movies;
	}
	
}
