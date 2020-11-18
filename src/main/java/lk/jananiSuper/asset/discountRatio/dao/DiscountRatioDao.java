package lk.jananiSuper.asset.discountRatio.dao;

import lk.jananiSuper.asset.discountRatio.entity.DiscountRatio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRatioDao extends JpaRepository< DiscountRatio, Integer > {
}
