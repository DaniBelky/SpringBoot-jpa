package com.educando.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso2.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}	
