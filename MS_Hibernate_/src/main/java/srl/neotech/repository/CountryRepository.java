package srl.neotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{
	
	@Query("select c from Country c where c.countryIsoCode=:isocode")
	public Country getCountryByIsoCode(String isocode);
	
}