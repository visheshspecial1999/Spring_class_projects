package com.jsp.train_ticket_online_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jsp.train_ticket_online_booking.dto.Train;
@EnableJpaRepositories
public interface TrainRepository extends JpaRepository<Train, Integer> {

	
}
