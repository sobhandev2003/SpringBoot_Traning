package com.sobhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sobhan.model.Order;
import com.sobhan.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService oservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Order order){
		String msg="Order Added Successfully.";
		oservice.addData(order);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Order>> getData(){
		List<Order> olist=oservice.getData();
		return new ResponseEntity<List<Order>>(olist,HttpStatus.OK);
	}
	
	@GetMapping("/fetch/{orderid}")
	public ResponseEntity<Order> getOrderByOrderId(@PathVariable Integer orderid) {

		Order order=oservice.getOrderByOrderId(orderid);
		
		return new ResponseEntity<Order>(order,HttpStatus.OK);
		
	}
	
@DeleteMapping("/delete/{orderid}")
	public ResponseEntity<String > deletData(@PathVariable Integer orderid) {
		Order order=oservice.deletData(orderid);
		String msg="Deleted successfuly";
		String errormsg="Invalid order Id";
		if(order!=null) {
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else {
			return  new ResponseEntity<String>(errormsg,HttpStatus.OK);
				
		}
		
	}

@PutMapping("/upd/{orderid}")
public ResponseEntity<String> updetOrderById(@PathVariable Integer orderid ,@RequestBody Order order) {
	Order orders=oservice.updetOrderById(orderid,order);
	String msg="Updete successfuly";
	String errormsg="Invalid order Id";
	
			if(orders!=null) {
				return new ResponseEntity<String>(msg,HttpStatus.OK);
			}
			else {
				return  new ResponseEntity<String>(errormsg,HttpStatus.OK);
					
	
	
			}
	
		}
}
