package com.store.storeservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.store.storeservice.entities.User;
import com.store.storeservice.repositories.UserRepository;

@Service
public class UserService {
	
	private UserService service;
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}
	
	@GetMapping
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
