package com.sobhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sobhan.model.Order;

@Repository //object creation and data base operation
public interface OrderRepo extends JpaRepository<Order, Integer> {

	
}
