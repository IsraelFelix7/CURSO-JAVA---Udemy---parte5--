package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


public interface UserRepository extends  JpaRepository<User, Long>{

	org.springframework.boot.autoconfigure.security.SecurityProperties.User save(
			org.springframework.boot.autoconfigure.security.SecurityProperties.User obj);

}
