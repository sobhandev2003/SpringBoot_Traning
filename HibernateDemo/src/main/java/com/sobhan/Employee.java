package com.sobhan;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="Employee_Master")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer eid;
	@Column(length = 25 , nullable = false)
	private String ename;
	@Column(name="desig",length=25)
	private String ededsig;
	@Column(length=30)
	private String email;
	@Temporal(TemporalType.DATE)
	private Date joindate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date workhr;
}
