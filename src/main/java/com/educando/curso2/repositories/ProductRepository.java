package com.educando.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso2.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}	
