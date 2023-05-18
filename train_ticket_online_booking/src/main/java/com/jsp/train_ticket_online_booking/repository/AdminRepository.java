package com.jsp.train_ticket_online_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.jsp.train_ticket_online_booking.dto.Admin;

@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<Admin,Integer>{
public Admin getByAdminName(String adminName);
}
