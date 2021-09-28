package com.tu4nnguyen.ecommerce.dao;

import com.tu4nnguyen.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
