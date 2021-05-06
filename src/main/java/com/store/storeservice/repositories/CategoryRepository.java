package com.store.storeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
