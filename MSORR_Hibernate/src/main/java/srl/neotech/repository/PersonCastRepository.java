package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Person;

public interface PersonCastRepository extends JpaRepository<Person, Integer>{

	@Query(value="select  person.person_id, person.person_name, count(movie_cast.movie_id) as numero_film\n"
			+ "FROM person\n"
			+ "JOIN movie_cast ON person.person_id = movie_cast.person_id\n"
			+ "GROUP BY person.person_id, person.person_name", nativeQuery= true)
	public List<Person> getPersonCast();
	
}
