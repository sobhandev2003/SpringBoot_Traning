package com.sobhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sobhan.model.Food;
import com.sobhan.model.Food;
import com.sobhan.service.FoodService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/food")
public class FoodControler {
		@Autowired
		private FoodService foodservice;
		
		@PostMapping("/add")
		public ResponseEntity<String> addData(@RequestBody Food food) {
			foodservice.addData(food);
			String msg="Food added successfully";
			
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
			
		}
		

		@GetMapping("/")
		public ResponseEntity<List<Food>> getData(){
			List<Food> olist=foodservice.getData();
			return new ResponseEntity<List<Food>>(olist,HttpStatus.OK);
		}
		
		@GetMapping("/fetch/{Foodid}")
		public ResponseEntity<Food> getFoodByFoodId(@PathVariable Integer Foodid) {

			Food Food =foodservice.getFoodById(Foodid);
			
			return new ResponseEntity<Food>(Food,HttpStatus.OK);
			
		}
		
	@DeleteMapping("/delete/{Foodid}")
		public ResponseEntity<String > deletData(@PathVariable Integer Foodid) {
			Food Food=foodservice.deleteData(Foodid);
			String msg="Deleted successfuly";
			String errormsg="Invalid Food Id";
			if(Food!=null) {
				return new ResponseEntity<String>(msg,HttpStatus.OK);
			}
			else {
				return  new ResponseEntity<String>(errormsg,HttpStatus.OK);
					
			}
			
		}

	@PutMapping("/upd/{Foodid}")
	public ResponseEntity<String> updetFoodById(@PathVariable Integer Foodid ,@RequestBody Food Food) {
		Food Foods=foodservice.updateData(Foodid,Food);
		String msg="Updete successfuly";
		String errormsg="Invalid Food Id";
		
				if(Foods!=null) {
					return new ResponseEntity<String>(msg,HttpStatus.OK);
				}
				else {
					return  new ResponseEntity<String>(errormsg,HttpStatus.OK);
						
		
		
				}
		
			}
			
		
}
