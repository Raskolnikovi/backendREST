package ubo.backend.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ubo.backend.rest.buisness.CandidatBussiness;
import ubo.backend.rest.entities.Candidat;




@RestController 
@RequestMapping("/Candidat")
public class CandidatController {

	private CandidatBussiness bussiness ;
	
	@Autowired
	public CandidatController(CandidatBussiness bussiness) {
		this.bussiness = bussiness;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public String supprimerCandidat(@PathVariable String id) {
		Candidat c = bussiness.rechercherCandidatParId(id);
		 bussiness.supprimerCandidat(c);
		return "Candidat supprimé avec succés";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Candidat> recupererTousLesCandidats() {
		return bussiness.recupererTousLesCandidats();  
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidat creerCandidat(@RequestBody Candidat candidatACreer) {
		return bussiness.creerCandidat(candidatACreer);
	}


	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Candidat> recupererCandidatParNom(@PathVariable String nom) {
		return bussiness.rechercheNom(nom);
	}
	@RequestMapping(method = RequestMethod.GET, value="/universite/{univOrigine}")
	public List<Candidat> recupererCandidatParUniversite(@PathVariable String univOrigine) {
		return bussiness.rechercheParUniversiteOrigine(univOrigine);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Candidat recupererCandidatParID(@PathVariable String id) {
		return bussiness.rechercherCandidatParId(id);
	}

}
