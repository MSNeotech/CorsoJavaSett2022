package srl.neotech.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.entity.ActorDepartmentEntity;
import srl.neotech.repository.ActorDepartmentRepository;

@Component
public class ActorDepartmentDAO {

	@Autowired
	ActorDepartmentRepository repo;
	
	public List<ActorDepartmentEntity> getActorDepartment(String depName1, String depName2){
		return repo.getActorDepartment(depName1, depName2);
	}
}
