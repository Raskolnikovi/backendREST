package ubo.backend.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ubo.backend.rest.buisness.PromotionBussiness;
import ubo.backend.rest.entities.Promotion;
import ubo.backend.rest.entities.PromotionPK;



@RestController 
@RequestMapping("/Promotion")
public class PromotionController {

	private PromotionBussiness business;

	@Autowired
	public PromotionController(PromotionBussiness business) {
		
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Promotion creerPromotion(@RequestBody Promotion promotiontACreer) {
		return business.creerPromotion(promotiontACreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Promotion> recupererTousLesPromotions() {
		return business.recupererTousLesPromotions();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/SiglePromotion/{SiglePromotion}")
	public List<Promotion> recupererPromotionParSigle(@PathVariable String SiglePromotion) {
		return business.rechercheSiglePromotion(SiglePromotion);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/ProcessusStage/{processusStage}")
	public List<Promotion> recupererPromotionParLeuRentree(@PathVariable String lieuRentree) {
		return business.rechercherParLieuRentree(lieuRentree);
	}

	@RequestMapping(method = RequestMethod.GET, value="/id/{anneUniv}/{codeForm}")
	public Promotion recupererPromotionParId(@PathVariable String anneUniv , @PathVariable String codeForm) {
		return business.rechercherPromotionParId(new PromotionPK(anneUniv,codeForm));
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/{codeForm}/{anneUniv}")
	public String suppCandidat(@PathVariable String codeForm , @PathVariable String anneUniv) {
		//Promotion p = recupererPromotionAvecLId(new PromotionPK(anneUniv,codeForm));
		 business.supprimerPromotionByID(new PromotionPK(anneUniv,codeForm));
		return "Spprimer !!";
	}

}
