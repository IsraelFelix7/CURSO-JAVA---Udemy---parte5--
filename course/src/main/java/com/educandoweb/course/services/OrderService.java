package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	public List<com.educandoweb.course.entities.Order> findAll(){
		return repository.findAll();
	}
	
	public com.educandoweb.course.entities.Order findById(Long id) {
		Optional<com.educandoweb.course.entities.Order> obj = repository.findById(id);
		return obj.get();
		}

}
