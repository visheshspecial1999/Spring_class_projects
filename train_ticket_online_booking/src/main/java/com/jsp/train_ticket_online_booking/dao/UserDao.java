package com.jsp.train_ticket_online_booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.train_ticket_online_booking.dto.User;
import com.jsp.train_ticket_online_booking.repository.UserRepository;

/**
 * 
 * @author vishe
 *
 */

@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepository;
	
	// saveUser method
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
