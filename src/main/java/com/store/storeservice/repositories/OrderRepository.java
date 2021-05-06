package com.store.storeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
