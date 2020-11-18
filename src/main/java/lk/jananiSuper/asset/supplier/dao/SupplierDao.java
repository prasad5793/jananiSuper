package lk.jananiSuper.asset.supplier.dao;

import lk.jananiSuper.asset.supplier.entity.Supplier;
import lk.jananiSuper.asset.supplierItem.entity.Enum.ItemSupplierStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository< Supplier, Integer> {
    Supplier findFirstByOrderByIdDesc();

    Supplier findByIdAndItemSupplierStatus(Integer supplierId, ItemSupplierStatus itemSupplierStatus);
}
