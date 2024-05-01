package com.educando.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso2.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}	
