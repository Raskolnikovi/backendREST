package ubo.backend.rest.buisness;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ubo.backend.rest.entities.*;
import ubo.backend.rest.repositories.*;

@Component
public class PromotionBussinessJPA   implements  PromotionBussiness{
	
	private PromotionRepository repos ;
	

	@Autowired 
	public PromotionBussinessJPA(PromotionRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Promotion creerPromotion(Promotion promotiontACreer) {
		// TODO Auto-generated method stub
		
		return repos.save(promotiontACreer);
	}

	@Override
	public void supprimerPromotion(Promotion promotionASupp) {
		// TODO Auto-generated method stub
		 repos.delete(promotionASupp);
	}

	
	public List<Promotion> rechercherParLieuRentree(String lieuRentree)
	{
		List<Promotion> promoRecherche = repos.findByLieuRentree(lieuRentree);
		return promoRecherche;
		
		
	}
	
	@Override
	public void supprimerPromotionByID(PromotionPK promotionASuppPK) {
		//Optional<Promotion> p = repos.findById(promotionASuppPK);
		repos.deleteById(promotionASuppPK);
	}
	@Override
	public List<Promotion> recupererTousLesPromotions() {
		// TODO Auto-generated method stub
		return (List<Promotion>) repos.findAll();
	}

	@Override
	public List<Promotion> rechercheSiglePromotion(String siglePromotion) {
		// TODO Auto-generated method stub
		List<Promotion> promoRecherche = repos.findBySiglePromotion(siglePromotion);
		return promoRecherche;
	}

	@Override
	public Promotion rechercherPromotionParId(PromotionPK PK) {
		// TODO Auto-generated method stub
		return repos.findById(PK).orElse(null);
	}

	

}
