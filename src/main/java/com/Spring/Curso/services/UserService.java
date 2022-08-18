package com.Spring.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Curso.entitites.User;
import com.Spring.Curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = (repository.findById(id));
				return obj.get();
	}
}
