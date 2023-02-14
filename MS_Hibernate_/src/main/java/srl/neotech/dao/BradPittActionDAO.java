package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.GenereEntity;
import srl.neotech.repository.BradPittActionRepository;

@Component
public class BradPittActionDAO {

	@Autowired
	BradPittActionRepository repo;
	
     public List<GenereEntity> getBradPittAction(String name, String gen) {
		
		return repo.getBradPittAction(name, gen);
	}
}
