package com.sobhan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sobhan.model.Order;
import com.sobhan.repository.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orepo;
	public void addData(Order order) {
		orepo.save(order);
	}
	
	public List<Order> getData(){
			return orepo.findAll();
		}
	
	public Order getOrderByOrderId(Integer orderId) {
		return orepo.findById(orderId).orElse(null);
	}
	
	
	
	public Order deletData(Integer orderid) {
		Order order=orepo.findById(orderid).orElse(null);
		if(order!=null) {
			orepo.delete(order);
		}
		return order;
	}
	
	public Order updetOrderById(Integer orderid , Order order) {
		Order orders=orepo.findById(orderid).orElse(null);
		if(order!=null) {
			orders.setOrderqty(order.getOrderqty());
			orders.setPrice(order.getPrice());
			orders.setProductname(order.getProductname());
			orepo.save(orders);
		}
		return orders;
	
	}
	
}
