package com.educando.curso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso2.entities.OrderItem;
import com.educando.curso2.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}	
