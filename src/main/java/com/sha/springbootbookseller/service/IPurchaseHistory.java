package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.repository.projection.PurchaseItem;
import model.PurchaseHistory;

import java.util.List;

public interface IPurchaseHistory {
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);
    public List<PurchaseItem> findPurchasedItemsOfUser(Long userId);
}
