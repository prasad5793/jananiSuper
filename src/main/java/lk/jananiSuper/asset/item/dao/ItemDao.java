package lk.jananiSuper.asset.item.dao;

import lk.jananiSuper.asset.category.entity.Category;
import lk.jananiSuper.asset.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDao extends JpaRepository< Item, Integer> {
    Item findFirstByOrderByIdDesc();

    List<Item> findByCategoryOrderByIdDesc(Category category);
}
