package lk.janani_super.asset.good_received_note.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.janani_super.asset.good_received_note.entity.enums.GoodReceivedNoteState;
import lk.janani_super.asset.ledger.entity.Ledger;
import lk.janani_super.asset.purchase_order.entity.PurchaseOrder;
import lk.janani_super.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("GoodReceivedNote")
public class GoodReceivedNote extends AuditEntity {
    private String remarks;

    @Column( precision = 10, scale = 2 )
    private BigDecimal totalAmount;

    @Enumerated( EnumType.STRING )
    private GoodReceivedNoteState goodReceivedNoteState;

    @ManyToOne
    private PurchaseOrder purchaseOrder;

    @OneToMany( mappedBy = "goodReceivedNote", cascade = CascadeType.PERSIST)
    private List< Ledger > ledgers;


}
