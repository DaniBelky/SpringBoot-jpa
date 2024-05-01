package com.educando.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso2.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	
}	
