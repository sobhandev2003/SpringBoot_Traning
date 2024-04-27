package com.sobhan.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Registration {
	@Id
	@Column(length=20)
	private String uname;
	@Column(length=20,nullable = false)
	private String pass;
	@Column(length=25)
	private String nm;
	@Column(length=30)
	private String email;
	@Column(length=10)
	private String phno;
}
