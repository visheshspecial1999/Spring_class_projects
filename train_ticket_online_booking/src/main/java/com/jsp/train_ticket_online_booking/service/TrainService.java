package com.jsp.train_ticket_online_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.train_ticket_online_booking.dao.TrainDao;
import com.jsp.train_ticket_online_booking.dto.Train;
import com.jsp.train_ticket_online_booking.response.ResponseStructure;

import jakarta.servlet.http.HttpSession;

@Service
public class TrainService {

	@Autowired
	private TrainDao trainDao;
	@Autowired
	private HttpSession httpSession;
	@Autowired
	private ResponseStructure<Train> responseStructure;
	/**
	 * @author vishe
	 * @param train
	 * @return
	 * save train details once the admin logged in
	 */
	
	// saveTrain method
	public ResponseStructure<Train> saveTrain(Train train) {
		if(httpSession.getAttribute("username")!=null) {
			Train train1=trainDao.saveTrain(train);
			responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
			responseStructure.setMessage("train details saved successfull in database");
			responseStructure.setDescription("train details  stored where train number is a primary key");
			responseStructure.setData(train1);
			return responseStructure;
		}
		else {
			responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setMessage("please logged in as Admin");
			responseStructure.setDescription("please logged in as Admin and then try to add train details");
			responseStructure.setData(train);
			return responseStructure;
		}
	}
}