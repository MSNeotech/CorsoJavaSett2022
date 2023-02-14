package srl.neotech.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	//                          alias di movie
	//                                              alias di MovieCast  alias di person
	//                                                                 
	@Query("select m from Movie m join m.movieCasts mc join mc.person   p where p.personName like %:name%")
	public List<Movie> getFilmByActor(String name);
	
	
	
	@Query("select m from Movie m join m.movieCasts mc join mc.person p where p.personName like %:name%")
	public Page<Movie> getFilmByActorPaged(String name,Pageable pageRequest);
	
	
	@Query("select m from Movie m join m.movieGenres mg join mg.genre g where g.genreName=:genere and m.popularity>:popolarita")
	public List<Movie> getMovieByGenreandPopularity(String genere, BigDecimal popolarita,Pageable pageRequest);

	
	
}