package com.jsp.train_ticket_online_booking.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.train_ticket_online_booking.dao.UserDao;
import com.jsp.train_ticket_online_booking.dto.User;
import com.jsp.train_ticket_online_booking.response.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private ResponseStructure<User> responseStructure;

	// saveUser method
		public ResponseStructure<User> saveUser(User user) {
		if((user.getUserName().length()<=10)&&(user.getUserPassword().length()<=8)) {
			String password=user.getUserPassword();
			Matcher alphabets=Pattern.compile("[a-zA-Z]").matcher(password);
			Matcher special=Pattern.compile("[!@#$%&*]").matcher(password);
			Matcher digit=Pattern.compile("[0-9]").matcher(password);
			if((alphabets.find())&&(special.find())&&(digit.find())) {
				User user1=userDao.saveUser(user);
				responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
				responseStructure.setMessage("User----Registered----Successfully---");
				responseStructure.setDescription("user has combination of alphabets special character and digits");
				responseStructure.setData(user1);
				return responseStructure;
			}
			else {
				responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
				responseStructure.setMessage("User--Not--Registered----Successfully---");
				responseStructure.setDescription("user has combination of alphabets special character and digits");
				responseStructure.setData(user);
				return responseStructure;
			}
		}
		else {
			responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setMessage("User--Not--Registered----Successfully---");
			responseStructure.setDescription("user should have username with less than equals to 10 characters and password should be less than equals to 8 characters with combination of special character alphabets and digits");
			responseStructure.setData(user);
			return responseStructure;
		}
		}
}