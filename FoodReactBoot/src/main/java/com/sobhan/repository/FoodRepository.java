package com.sobhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sobhan.model.Food;

@Repository
public interface FoodRepository  extends JpaRepository<Food, Integer>{

}
