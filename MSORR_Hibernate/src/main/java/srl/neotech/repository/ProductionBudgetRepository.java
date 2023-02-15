package srl.neotech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import srl.neotech.entity.ProductionBudgetEntity;
import srl.neotech.entity.ProductionCompany;


public interface ProductionBudgetRepository  extends  JpaRepository<ProductionCompany, Integer>
{

	@Query(nativeQuery = true, value = "SELECT production_company.company_name companyName, movie.title title ,movie.budget budget\n"
			+ "FROM production_company\n"
			+ "JOIN movie_company ON production_company.company_id= movie_company.company_id\n"
			+ "JOIN movie ON movie_company.movie_id = movie.movie_id\n"
			+ "WHERE movie.budget >:budget")

	public List<ProductionBudgetEntity> getProductionBudget(Integer budget);
}
