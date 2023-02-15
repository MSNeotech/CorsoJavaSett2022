package srl.neotech.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.entity.ProductionBudgetEntity;
import srl.neotech.repository.ProductionBudgetRepository;

@Component
public class ProductionBudgetDAO {

	@Autowired
	ProductionBudgetRepository repo;
	
	public List<ProductionBudgetEntity> getProductionBudget(Integer budget){
		return repo.getProductionBudget(budget);
	}
	
}
