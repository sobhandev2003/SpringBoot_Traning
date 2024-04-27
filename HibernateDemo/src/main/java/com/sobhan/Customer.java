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
public class Customer {
	@Id
	@Column(length=10)
	private String cid;
	
	@Column(length=25 , nullable=false)
	private String cname;
	@Column(length=10)
	private String cphon;
	

}
