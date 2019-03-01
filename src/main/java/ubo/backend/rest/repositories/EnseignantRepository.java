package ubo.backend.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ubo.backend.rest.buisness.*;
import ubo.backend.rest.entities.*;

public interface EnseignantRepository extends CrudRepository<Enseignant, String> {

	List<Enseignant> findByNom(String nom);
	Enseignant findByNoEnseignant(long id);
	Enseignant findByEmailUbo(String emailUbo);
	Enseignant findByAdresse (String adresse);

}
