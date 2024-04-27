package com.sobhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobhan.model.Food;
import com.sobhan.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired	
	private  FoodRepository frepo;
	
	public void addData(Food food) {
		frepo.save(food);
	}
	public List<Food> getData(){
		return frepo.findAll();
	}
	
	public Food getFoodById(Integer foodid) {
		return frepo.findById(foodid).orElse(null);
	}
	
	public Food deleteData(Integer foodid) {
		Food food=frepo.findById(foodid).orElse(null);
		if(food!=null) {
			frepo.delete(food);
		}
		return food;
	}
	
	public Food updateData(Integer foodid,Food food) {
		Food resfood=frepo.findById(foodid).orElse(null);
		if(resfood!=null) {
			resfood.setFoodnm(food.getFoodnm());
			resfood.setPrice(food.getPrice());
			frepo.save(resfood);
		}
		return resfood;
	}
	
	
}
