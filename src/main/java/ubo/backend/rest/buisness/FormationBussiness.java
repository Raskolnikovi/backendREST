package ubo.backend.rest.buisness;

import java.util.List;
import java.util.Optional;

import ubo.backend.rest.entities.*;
import ubo.backend.rest.repositories.*;

public interface FormationBussiness {
	Formation creerFormation(Formation formationACreer);

	 List<Formation> recupererToutesLesFormations();
	 List<Formation> rechercherFormationParNom(String nom);
	 //List<Formation> recupererToutesLesFormationsParId(String id);
	 Formation rechercherFormationParId(String id);

	void supprimerFormationByID(String codeFormation);

	Formation updateFormation(Formation formationMaj);

}
