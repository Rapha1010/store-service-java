package com.store.storeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
