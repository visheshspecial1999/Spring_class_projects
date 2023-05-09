package com.jsp.one_to_one_bi_direction.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mylaptop")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "laptopid")
		private int laptopId;
		
		@Column(name="laptopname", nullable=false)
		private String laptopName;
		
		@Column(name="laptopprice", nullable=false)
		private double laptomPrice;
		
		@OneToOne(mappedBy = "laptop")
		private Employee employee;
}
