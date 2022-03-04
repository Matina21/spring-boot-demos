package com.example.jpa.demo.orders;

import com.example.jpa.demo.orders.entity.ProductItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItemEntity, String> {
}
