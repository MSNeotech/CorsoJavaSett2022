package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.MovieBradPittActionEntity;
import srl.neotech.repository.MovieBradPittActionRepository;

@Component
public class MovieBradPittActionDAO {

	@Autowired
	MovieBradPittActionRepository repo;
	
	
	public List<MovieBradPittActionEntity> getBradPittAction(String name, String gen){
		
		return repo.getBradPittAction(name, gen);
	}
	
}
