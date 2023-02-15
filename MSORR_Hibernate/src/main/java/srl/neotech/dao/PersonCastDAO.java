package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Person;
import srl.neotech.repository.PersonCastRepository;

@Component
public class PersonCastDAO {

	@Autowired
	PersonCastRepository repo;
	
	public List<Person> getPersonCast(){
		return repo.getPersonCast();
	}
}
