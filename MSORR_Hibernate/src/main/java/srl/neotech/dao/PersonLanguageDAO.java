package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.PersonLanguageEntity;
import srl.neotech.repository.PersonLanguageRepository;

@Component
public class PersonLanguageDAO {

	@Autowired
	PersonLanguageRepository repo;
	
	public List<PersonLanguageEntity> getPersonLanguage(String lang){
		return repo.getPersonLanguage(lang);
	}
}
