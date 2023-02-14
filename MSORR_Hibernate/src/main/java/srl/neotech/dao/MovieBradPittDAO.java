package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.MovieBradPittEntity;
import srl.neotech.repository.MovieBradPittRepository;


@Component
public class MovieBradPittDAO {

	@Autowired
	MovieBradPittRepository movie;
	
	
	public List<MovieBradPittEntity> getBradPitt (String name){
		
		return movie.getBradPitt(name);
	}
	
}
