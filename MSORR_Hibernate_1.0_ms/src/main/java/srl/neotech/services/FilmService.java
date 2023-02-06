package srl.neotech.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.FilmDao;
import srl.neotech.entity.Movie;
import srl.neotech.entity.Person;
import srl.neotech.entity.ProductionCompany;
import srl.neotech.model.Film;
import srl.neotech.model.Persona;
import srl.neotech.model.ProdCompany;

@Service
public class FilmService {

	@Autowired
	FilmDao filmDao;

	
	
	
	public Film getFilm(Integer film_id) {
		Movie m= filmDao.getMovie(film_id);
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Film f=modelMapper.map(m,Film.class);
		return f;
	}

	public List<Film> getFilmByActor(String name) {
		
		List<Movie> movies=filmDao.getMovieByActor(name);
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<Film> films=new ArrayList<>();
		for(Movie movie:movies) {
			films.add(modelMapper.map(movie, Film.class));
		}
		return films;
	}

	
	@Transactional
	public void insertFilm(Film f) {
		ModelMapper modelMapper = new ModelMapper();
		Movie m=modelMapper.map(f,Movie.class);
		filmDao.insertMovie(m);
		
	}
	
	public Persona getPersona(Integer persona_Id) {
		
		Person p = filmDao.getPersona(persona_Id);
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Persona persona = modelMapper.map(p, Persona.class);
		
		return persona;
		
	}
	
	public ProdCompany getProductionCompany(Integer azienda_Id) {
		
		ProductionCompany producation = filmDao.getProductionCompany(azienda_Id);
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ProdCompany prod = modelMapper.map(producation,ProdCompany.class );
		
		return prod;
	}
	
	@Transactional
	public void insertPersona(Persona p) {
		ModelMapper modelMapper = new ModelMapper();
		Person pers = modelMapper.map(p, Person.class);
		filmDao.insertPerson(pers);
		
	}
	
	@Transactional
	public void mergePersona(Persona p) {
		
		ModelMapper modelMapper = new ModelMapper();
		Person pers = modelMapper.map(p, Person.class);
		filmDao.mergePersona(pers);
	
	}
	
	@Transactional
	public void insertCompany(ProdCompany com) {
		ModelMapper modelMapper = new ModelMapper();
		ProductionCompany company = modelMapper.map(com, ProductionCompany.class);
		filmDao.insertCompany(company);
		
	}
	
	@Transactional
	public void mergeCompany(ProdCompany com) {
		ModelMapper modelMapper = new ModelMapper();
		ProductionCompany company = modelMapper.map(com, ProductionCompany.class);
		filmDao.mergeCompany(company);
		
	}
}
