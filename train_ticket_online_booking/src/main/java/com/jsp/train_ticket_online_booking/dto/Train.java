package com.jsp.train_ticket_online_booking.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Train {
	
	@Id
	private int trainNumber;
	private String trainName;
	private String trainSource;
	private String trainDestination;
	private boolean saturday;
	private boolean sunday;
	private boolean monday;
	private boolean tuesday;
	private boolean wednesday;
	private boolean thursday;
	private boolean friday;
}