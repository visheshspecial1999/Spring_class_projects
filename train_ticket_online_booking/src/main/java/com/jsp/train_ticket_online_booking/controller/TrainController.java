package com.jsp.train_ticket_online_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.train_ticket_online_booking.dto.Train;
import com.jsp.train_ticket_online_booking.response.ResponseStructure;
import com.jsp.train_ticket_online_booking.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	// saveTrain method
		@PostMapping("/saveTrain")
		public ResponseStructure<Train> saveTrain(@RequestBody Train train) {
			return trainService.saveTrain(train);
		}

}
