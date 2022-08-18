package com.Spring.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Curso.entitites.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	
}
