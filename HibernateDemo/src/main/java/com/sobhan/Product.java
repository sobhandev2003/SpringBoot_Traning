package com.sobhan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	@Id
	@Column(length=10)
	private String pid;
	
	@Column(length=25,nullable = false)
	
	private String pname;
	
	private Integer pqty;
	private Double price;
	
	
}
