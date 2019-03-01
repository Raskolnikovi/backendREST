package ubo.backend.rest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ubo.backend.rest.entities.Promotion;
import ubo.backend.rest.entities.PromotionPK;




public interface PromotionRepository extends CrudRepository<Promotion, PromotionPK>  {
	List<Promotion> findBySiglePromotion(String siglePromotion);
	List<Promotion>  findByLieuRentree(String lieuRentree);
}
