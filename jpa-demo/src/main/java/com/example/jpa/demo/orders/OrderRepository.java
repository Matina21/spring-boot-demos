package com.example.jpa.demo.orders;

import com.example.jpa.demo.orders.entity.OrderLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderLineEntity, String> {
}
