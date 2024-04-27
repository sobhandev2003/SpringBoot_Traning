package com.sobhan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Candidate {
	@Id
	@Column(length=10)
	private String candid;
	@Column(length=25,nullable = false)
	private String candnm;
	
	
	
}
