package ubo.backend.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ubo.backend.rest.entities.Formation;



public interface FormationRepository extends CrudRepository<Formation, String> {

	List<Formation> findByNomFormation(String nomFormation);
	Formation findByCodeFormation(String codeFormation);
	
}
