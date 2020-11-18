package lk.jananiSuper.asset.payment.dao;

import lk.jananiSuper.asset.PurchaseOrder.entity.PurchaseOrder;
import lk.jananiSuper.asset.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentDao extends JpaRepository< Payment,Integer> {
    List< Payment> findByPurchaseOrder(PurchaseOrder purchaseOrder);

    Payment findFirstByOrderByIdDesc();
}
