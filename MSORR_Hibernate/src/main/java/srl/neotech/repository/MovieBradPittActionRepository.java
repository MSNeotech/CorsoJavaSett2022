package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Movie;
import srl.neotech.entity.MovieBradPittActionEntity;


public interface MovieBradPittActionRepository  extends JpaRepository<Movie, Integer>{

	@Query(nativeQuery = true, value = "SELECT movie.*\n"
			+ "FROM movie\n"
			+ "JOIN movie_cast ON movie.movie_id = movie_cast.movie_id\n"
			+ "JOIN person ON person.person_id = movie_cast.person_id\n"
			+ "JOIN movie_genres ON movie.movie_id = movie_genres.movie_id\n"
			+ "JOIN genre ON genre.genre_id = movie_genres.genre_id\n"
			+ "WHERE person.person_name =:name AND genre.genre_name =:gen")
	public List<MovieBradPittActionEntity> getBradPittAction(String name, String gen);
}
