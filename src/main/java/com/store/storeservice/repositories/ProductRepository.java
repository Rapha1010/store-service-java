package com.store.storeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
