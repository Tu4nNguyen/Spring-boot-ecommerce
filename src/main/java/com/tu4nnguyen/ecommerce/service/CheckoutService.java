package com.tu4nnguyen.ecommerce.service;

import com.tu4nnguyen.ecommerce.dto.Purchase;
import com.tu4nnguyen.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
