package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.repository.projection.PurchaseItem;
import model.PurchaseHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryRepository implements IPurchaseHistory {

    @Autowired
    private PurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {

        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.savePurchaseHistory(purchaseHistory);
    }
    public List<PurchaseItem> findPurchasedItemsOfUser(Long userId) {
        return purchaseHistoryRepository.findPurchasedItemsOfUser(userId);
    }
}
