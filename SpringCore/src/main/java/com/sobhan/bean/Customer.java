package com.sobhan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component(value="cs")
public class Customer {
	@Value("C1")
	private String cid;
	@Value("SUMAN")
	private String cname;
	@Value("5454445")
	private String cphone;
	
//	public Customer() {
//		
//	}
//	public Customer(String cid,String cname,String cphone) {
//		this.cid=cid;
//		this.cname=cname;
//		this.cphone=cphone;
//	}
//	
//	public String getCid() {
//		return cid;
//	}
//	public void setCid(String cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public String getCphone() {
//		return cphone;
//	}
//	public void setCphone(String cphone) {
//		this.cphone = cphone;
//	}
//	@Override
//	public String toString() {
//		return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + "]";
//	}
	

}
