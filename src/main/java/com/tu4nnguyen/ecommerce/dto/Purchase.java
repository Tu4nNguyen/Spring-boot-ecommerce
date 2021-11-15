package com.tu4nnguyen.ecommerce.dto;

import com.tu4nnguyen.ecommerce.entity.Address;
import com.tu4nnguyen.ecommerce.entity.Customer;
import com.tu4nnguyen.ecommerce.entity.Order;
import com.tu4nnguyen.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}

