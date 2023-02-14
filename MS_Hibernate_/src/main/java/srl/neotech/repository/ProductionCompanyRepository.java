package srl.neotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import srl.neotech.entity.ProductionCompany;

public interface ProductionCompanyRepository extends JpaRepository<ProductionCompany, Integer>, JpaSpecificationExecutor<ProductionCompany> {
}