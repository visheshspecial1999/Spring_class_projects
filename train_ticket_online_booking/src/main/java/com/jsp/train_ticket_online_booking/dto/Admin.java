package com.jsp.train_ticket_online_booking.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adminid", length = 6)
	private int AdminId;
	@Column(name = "adminname")
	private String adminName;
	@Column(name = "adminpassword")
	private String adminPassword;

}
