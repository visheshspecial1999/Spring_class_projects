package com.jsp.one_to_one_bi_direction.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "myemployee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid")
	private int employeeId;
	@Column(name = "employeename",nullable = false)
	private String employeeName;
	@Column(name = "employeeemail",nullable = false)
	private String employeeEmail;
	
	@OneToOne
	@JoinColumn(name = "laptopid")
	private Laptop laptop;
	
}
