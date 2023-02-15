package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import srl.neotech.entity.ActorDepartmentEntity;
import srl.neotech.entity.Movie;

public interface ActorDepartmentRepository extends JpaRepository<Movie, Integer>{
	
	@Query(nativeQuery = true, value = "select DISTINCT person.person_name personName, department.department_name departmentName\n"
			+ "from movie\n"
			+ "join movie_cast on movie.movie_id = movie_cast.movie_id\n"
			+ "join person on movie_cast.person_id = person.person_id\n"
			+ "join movie_crew on person.person_id = movie_crew.person_id\n"
			+ "join department on movie_crew.department_id = department.department_id\n"
			+ "WHERE department.department_name =:depName1 or department.department_name=:depName2")

	public List<ActorDepartmentEntity> getActorDepartment(String depName1, String depName2);

}
