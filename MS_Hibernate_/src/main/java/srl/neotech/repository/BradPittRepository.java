package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import srl.neotech.entity.Person;

public interface BradPittRepository extends JpaRepository<Person, Integer> {

	@Query(value="select movie.title, person_name\n"
			+ "from person\n"
			+ "JOIN movie_crew On movie_crew.person_id = person.person_id\n"
			+ "join movie on movie.movie_id = movie_crew.movie_id\n"
			+ "where person.person_name =:name",
			nativeQuery =true)
	public List<Person> queryBradPitt(String name);

}
