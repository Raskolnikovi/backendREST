package ubo.backend.rest.buisness;

import java.util.List;

import ubo.backend.rest.entities.*;
import ubo.backend.rest.repositories.*;

public interface PromotionBussiness {

	Promotion creerPromotion(Promotion promotiontACreer);
	void supprimerPromotion(Promotion promotionASupp);
	List<Promotion> recupererTousLesPromotions();
	List<Promotion> rechercheSiglePromotion(String siglePromotion);
	Promotion rechercherPromotionParId(PromotionPK PK );
	void supprimerPromotionByID(PromotionPK promotionASuppPK);
	public List<Promotion> rechercherParLieuRentree(String lieuRentree);
	

}
