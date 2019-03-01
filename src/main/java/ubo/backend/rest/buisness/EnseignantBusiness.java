package ubo.backend.rest.buisness;

import java.util.List;

import ubo.backend.rest.entities.*;
import ubo.backend.rest.repositories.*;

public interface EnseignantBusiness {

	Enseignant creerEnseignant(Enseignant enseignantACreer);

	List<Enseignant> rechercheEnseignantParNom(String nom);

	List<Enseignant> recupererTousLesEnseignants();

	Enseignant rechercherEnseignantParId(long id);

	void supprimerEnseignantByID(long id);

	Enseignant rechercherParEmail(String email);
}
