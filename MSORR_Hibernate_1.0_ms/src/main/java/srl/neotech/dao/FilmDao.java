package srl.neotech.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.criterion.Example;
import org.hibernate.criterion.Example.PropertySelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import srl.neotech.entity.Language;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;
import srl.neotech.entity.ProductionCompany;
import srl.neotech.repository.MovieRepository;

@Component
public class FilmDao {

	@Autowired
	EntityManager entityManager;
	
	@Autowired
	MovieRepository movieRepository;
	
	public Movie getMovie(Integer movie_id) {
	
	//find by PK	
	Movie m=entityManager.find(Movie.class, movie_id); 	
	return m;	
	}
	
	public List<Movie> getMovieByActor(String name) {
		
		//find by PK	
		 List<Movie> movies=movieRepository.getFilmByActor(name);
		return movies;	
		}
	
	
	public void insertMovie(Movie movie) {
		
	//insert
	entityManager.persist(movie); 
	}
	
	public Person getPersona(Integer persona_Id) {
		Person p = entityManager.find(Person.class, persona_Id);
		return p;
		
	}
	
	public ProductionCompany getProductionCompany(Integer azienda_Id) {
		
		ProductionCompany prod =entityManager.find(ProductionCompany.class, azienda_Id);
		return prod;
	}
	
	public void insertPerson(Person p) {
		entityManager.persist(p);
	}
	
    public void mergePersona(Person p) {
		Person existingPerson = entityManager.find(Person.class, p.getId());
	    
	    existingPerson.setPersonName(p.getPersonName());
	    entityManager.merge(existingPerson);
	    
	}
    
	public void insertCompany(ProductionCompany prod) {
		entityManager.persist(prod);
	}
	
	public void mergeCompany(ProductionCompany prod) {
		ProductionCompany existingCompany = entityManager.find(ProductionCompany.class, prod.getId());
	    existingCompany.setCompanyName(prod.getCompanyName());
	    entityManager.merge(existingCompany);
	  
	}
	
}
