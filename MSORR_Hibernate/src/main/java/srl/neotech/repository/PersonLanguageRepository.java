package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Person;
import srl.neotech.entity.PersonLanguageEntity;


public interface PersonLanguageRepository extends JpaRepository<Person, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT person.person_id id, person.person_name personName,movie.title title ,language.language_name languageName\n"
			+ "FROM person\n"
			+ "join movie_crew on person.person_id = movie_crew.person_id\n"
			+ "join movie on movie_crew.movie_id = movie.movie_id\n"
			+ "join movie_languages on movie.movie_id = movie_languages.movie_id\n"
			+ "join language on movie_languages.language_id = language.language_id\n"
			+ "where language.language_name = :lang")

	public List<PersonLanguageEntity> getPersonLanguage(String lang);
}
