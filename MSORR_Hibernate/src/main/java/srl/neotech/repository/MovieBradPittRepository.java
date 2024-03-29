package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.MovieBradPittEntity;
import srl.neotech.entity.Person;

public interface MovieBradPittRepository extends JpaRepository<Person, Integer>{

	@Query(nativeQuery = true, value = "select movie.title title, person_name personName \n"
			+ "from person\n"
			+ "JOIN movie_crew On movie_crew.person_id = person.person_id\n"
			+ "join movie on movie.movie_id = movie_crew.movie_id\n"
			+ "where person.person_name = :name")
	public List<MovieBradPittEntity> getBradPitt(String name);
	
}
