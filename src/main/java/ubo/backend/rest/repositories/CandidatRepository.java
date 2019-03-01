package ubo.backend.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ubo.backend.rest.buisness.*;
import ubo.backend.rest.entities.Candidat;

public interface CandidatRepository extends CrudRepository<Candidat, String> {
	
	List<Candidat> findByNom(String nom);
	
	List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	
	Candidat findByNoCandidat(String noCandidat);

}
