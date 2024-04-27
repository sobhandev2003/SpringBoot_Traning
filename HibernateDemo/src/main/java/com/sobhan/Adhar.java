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
public class Adhar {
	@Id
	@Column(length = 25)
	private String adharid;
	@Column(length = 50 , nullable = false)
	private String addr;
	
	@OneToOne
	@JoinColumn(name="CA_ID")
	Candidate can;

}
