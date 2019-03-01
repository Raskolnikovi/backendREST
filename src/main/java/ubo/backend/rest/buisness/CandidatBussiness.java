package ubo.backend.rest.buisness;

import java.util.List;

import ubo.backend.rest.entities.*;



public interface CandidatBussiness {
	Candidat creerCandidat(Candidat candidatACreer);
	List<Candidat> recupererTousLesCandidats();
	void supprimerCandidat(Candidat candidatASupp);
	//void supprimerCandidat(String Id);
	List<Candidat> rechercheNom(String nom);
	List<Candidat> rechercheParUniversiteOrigine(String UnivOrigine);
	Candidat rechercherCandidatParId(String id);
	//Candidat supprimerCandidat(Candidat candidatASupprimer) ;
}
