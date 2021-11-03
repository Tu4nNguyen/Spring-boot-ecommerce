package com.tu4nnguyen.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    //Lombok @Data will generate constructor for final fields
    private final String orderTrackingNumber;
}
