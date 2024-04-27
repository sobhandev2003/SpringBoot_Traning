package com.sobhan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "bs")
public class Book {

	@Value("B1")
	private String bid;
	@Value("Core Java")
	private String bname;
	@Value("700.00")
	private Double price;
	public Book() {
	
	}
	public Book(String bid,String bname,Double price) {
		this.bid=bid;
		this.bname=bname;
		this.price=price;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
}
