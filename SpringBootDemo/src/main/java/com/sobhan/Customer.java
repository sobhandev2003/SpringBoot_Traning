package com.sobhan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Customer {
	
	@Value("c1")
	private String cid;
	@Value("Arup")
	private String cname;
	@Value("5454445")
	private String cphon;

}
