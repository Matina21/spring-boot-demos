package com.example.jpa.demo.orders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class OrderLineEntity {

    @Id
    private String orderId;
    private String customerId;
    @OneToMany
    private List<ProductItemEntity> productItems;
    private Date createdAt;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<ProductItemEntity> getProductItems() {
        return productItems;
    }

    public void setProductItems(List<ProductItemEntity> productItems) {
        this.productItems = productItems;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
