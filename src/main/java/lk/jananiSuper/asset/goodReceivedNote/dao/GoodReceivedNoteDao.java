package lk.jananiSuper.asset.goodReceivedNote.dao;

import lk.jananiSuper.asset.PurchaseOrder.entity.PurchaseOrder;
import lk.jananiSuper.asset.goodReceivedNote.entity.GoodReceivedNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodReceivedNoteDao extends JpaRepository< GoodReceivedNote, Integer> {
    GoodReceivedNote findByPurchaseOrder(PurchaseOrder purchaseOrder);
}
