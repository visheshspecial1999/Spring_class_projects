package com.jsp.train_ticket_online_booking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.train_ticket_online_booking.dto.Admin;
import com.jsp.train_ticket_online_booking.repository.AdminRepository;

/**
 * 
 * @author vishe
 *
 *admin Dao is reponsible for all the crud operation of admin class
 */
@Repository
public class AdminDao {
	
	@Autowired
	private AdminRepository adminRepository;
	// registerAdmin method
	public Admin registerAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	// loginAdmin method
	public Admin loginAdmin(String adminName) {
		return adminRepository.getByAdminName(adminName);
	}
	
}
