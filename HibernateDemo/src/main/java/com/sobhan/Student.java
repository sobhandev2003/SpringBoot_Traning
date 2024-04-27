package com.sobhan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer Rollno;
	@Column(length=25,nullable = false)
	private String Sname;
	
	@OneToOne
	@JoinColumn(name="T_Id")
	Teacher trs;
}
