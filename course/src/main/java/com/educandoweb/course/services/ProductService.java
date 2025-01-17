package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	public List<com.educandoweb.course.entities.Product> findAll(){
		return repository.findAll();
	}
	
	public com.educandoweb.course.entities.Product findById(Long id) {
		Optional<com.educandoweb.course.entities.Product> obj = repository.findById(id);
		return obj.get();
		}

}
