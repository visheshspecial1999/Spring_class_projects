package com.jsp.train_ticket_online_booking.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.train_ticket_online_booking.dao.AdminDao;
import com.jsp.train_ticket_online_booking.dto.Admin;

import jakarta.servlet.http.HttpSession;
/**
 * 
 * @author vishe
 *
 */
@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private HttpSession httpSession;
	
	// registerAdmin method
		public Admin registerAdmin(Admin admin) {
			String password=admin.getAdminPassword();
			if(password.length()==8) {
				Pattern alphabets=Pattern.compile("[a-zA-Z]");
				Pattern number=Pattern.compile("[0-9]");
				Pattern special=Pattern.compile("[!@#$*&%]");
				
				Matcher alpha=alphabets.matcher(password);
				Matcher num=number.matcher(password);
				Matcher spec=special.matcher(password);
				if((alpha.find())&&(num.find())&&(spec.find())) {
					adminDao.registerAdmin(admin);
					return admin;
				}
				else {
					return null;
				}
			}else {
					return null;
				}
			}
		
		// loginAdmin method
		public Admin loginAdmin(String adminName,String adminPassword) {
			Admin admin=adminDao.loginAdmin(adminName);
			if(admin!=null) {
				if((admin.getAdminName().equalsIgnoreCase(adminName))&&(admin.getAdminPassword().contentEquals(adminPassword))) {
			httpSession.setAttribute("username",admin.getAdminName());
			return admin;
				}
				else {
					return null;
				}
			}else {
			return null;
		}
		}
}