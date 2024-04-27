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

import org.hibernate.internal.build.AllowSysOut;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllowSysOut
@Entity
@Table(name="ITEM_MASTER")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer icode;
	
	@Column(length=10,nullable = false)
	private String iname;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDT;
	
	private Integer iqty;

}
