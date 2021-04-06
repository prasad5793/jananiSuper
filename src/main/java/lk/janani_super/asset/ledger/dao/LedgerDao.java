package lk.janani_super.asset.ledger.dao;


import lk.janani_super.asset.item.entity.Item;
import lk.janani_super.asset.ledger.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LedgerDao extends JpaRepository< Ledger, Integer> {
    List<Ledger> findByItem(Item item);

    Ledger findByItemAndAndExpiredDateAndSellPrice(Item item, LocalDate eDate, BigDecimal sellPrice);

    List<Ledger> findByExpiredDateBetween(LocalDate from, LocalDate to);

    List< Ledger > findByCreatedAtBetween(LocalDateTime form, LocalDateTime to);

}
