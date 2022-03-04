package com.example.jpa.demo.orders;

import com.example.jpa.demo.orders.entity.OrderLineEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class OrderApi {

    private final OrderRepository orderRepository;
    private final ProductItemRepository productItemRepository;

    public OrderApi(OrderRepository orderRepository, ProductItemRepository productItemRepository) {
        this.orderRepository = orderRepository;
        this.productItemRepository = productItemRepository;
    }

    @PostMapping("/api/orders")
    public OrderLineEntity create(@RequestBody OrderLineEntity orderLine) {
        productItemRepository.saveAll(orderLine.getProductItems());
        orderLine.setCreatedAt(new Date());
        orderLine.setOrderId(UUID.randomUUID().toString());
        return this.orderRepository.save(orderLine);
    }

    @GetMapping("/api/orders")
    public List<OrderLineEntity> list() {
        return this.orderRepository.findAll();
    }


}
