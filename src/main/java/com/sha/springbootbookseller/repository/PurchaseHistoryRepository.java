package com.sha.springbootbookseller.repository;

import com.sha.springbootbookseller.repository.projection.PurchaseItem;
import model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("select " +
            "b.title as title, ph.price as price, ph.purchaseTime as purchaseTime " +
            "from PurchaseHistory ph left join Book b on b.id = ph.bookId " +
            "where ph.userId = :userId"  )
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);


}
