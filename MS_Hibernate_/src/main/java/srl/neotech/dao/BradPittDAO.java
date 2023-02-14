package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Person;
import srl.neotech.repository.BradPittRepository;

@Component
public class BradPittDAO {
	
	@Autowired
	BradPittRepository repo;

	public List<Person> getBradPitt(String name) {
		
		return repo.queryBradPitt(name);
	}
	
}
