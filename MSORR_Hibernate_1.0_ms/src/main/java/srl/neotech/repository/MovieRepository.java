package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>, JpaSpecificationExecutor<Movie> {
	
	@Query("select m from Movie m join m.movieCasts mc join mc.person p where p.personName like %?1%")
	public List<Movie> getFilmByActor(String name);
	
	
	
}