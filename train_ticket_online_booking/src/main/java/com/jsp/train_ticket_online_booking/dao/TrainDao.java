package com.jsp.train_ticket_online_booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.train_ticket_online_booking.dto.Train;
import com.jsp.train_ticket_online_booking.repository.TrainRepository;

@Repository
public class TrainDao {
	
	@Autowired
	private TrainRepository trainRepository;
	
	// saveTrain method
	public Train saveTrain(Train train) {
		return trainRepository.save(train);
	}

	
}
