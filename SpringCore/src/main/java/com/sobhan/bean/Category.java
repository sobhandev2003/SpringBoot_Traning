package com.sobhan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "cgs")
public class Category {
	@Value("Programing Language")
	private String categoryname;
	@Autowired
	private Book bk;
	public Category() {
		
	}
	public Category(String categoryname,Book bk) {
		this.categoryname=categoryname;
		this.bk=bk;
	}
	
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Category [categoryname=" + categoryname + ", bk=" + bk + "]";
	}
	
	

}
