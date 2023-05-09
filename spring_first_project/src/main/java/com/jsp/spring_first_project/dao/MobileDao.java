package com.jsp.spring_first_project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring_first_project.dto.Mobile;
import com.jsp.spring_first_project.repository.MobileRepository;
@Repository
public class MobileDao {

	@Autowired
	MobileRepository mobileRepository;

	// saveMobile method
	public Mobile saveMobile(Mobile mobile) {
		mobileRepository.save(mobile);
		return mobile;
	}
	
	// getMobileById method
	public Mobile getMobileById(int mobileId) {
		Optional<Mobile> optional=mobileRepository.findById(mobileId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
		return null;
		}
	}
	
	// updateMobile method
	public Mobile updateMobile(Mobile mobile, int mobileId) {
	Optional<Mobile> optional=mobileRepository.findById(mobileId);
	if(optional.isPresent()) {
		mobileRepository.save(mobile);
	return mobile;
	}
	else {
		return null;
	}
	}
	
	// deleteMobile method
	public String deleteMobile(int mobileId) {
	Optional<Mobile> optional=mobileRepository.findById(mobileId);
	if(optional.isPresent()) {
		mobileRepository.delete(optional.get());
		return "data deleted successfully";
	}
	else {	
	return "productId not present in database";
	}
	}
	
	//displayAllMobile method
	public List<Mobile> displayMobile(){
		return  mobileRepository.findAll();
	}
	
	//saveCollectionMobile method
	public List<Mobile> saveCollectionMobile(List<Mobile> mobiles){
		return mobileRepository.saveAll(mobiles);
	}
}