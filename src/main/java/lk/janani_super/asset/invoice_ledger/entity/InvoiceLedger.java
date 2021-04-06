package lk.janani_super.asset.invoice_ledger.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
import lk.janani_super.asset.invoice.entity.Invoice;
import lk.janani_super.asset.ledger.entity.Ledger;
import lk.janani_super.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("InvoiceLedger")
public class InvoiceLedger extends AuditEntity {

    @Column(nullable = false)
    private String quantity;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal lineTotal;

    @ManyToOne
    private Ledger ledger;

    @ManyToOne
    private Invoice invoice;

}
