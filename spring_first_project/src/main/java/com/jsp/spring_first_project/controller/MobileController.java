package com.jsp.spring_first_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring_first_project.dto.Mobile;
import com.jsp.spring_first_project.dto.ResponseStructrure;
import com.jsp.spring_first_project.exception.IdNotFoundException;
import com.jsp.spring_first_project.service.MobileService;

@RestController
public class MobileController {

	// checkStatus method
	@GetMapping(value = "/checkStatus")
	public String checkStatus() {
		return "program is working fine";
	}

	@Autowired
	MobileService mobileService;

	// saveMobile method
	@PostMapping(value = "/saveMobile")
	public Mobile saveMobile(@RequestBody Mobile mobile) {
		return mobileService.saveMobile(mobile);
	}

	// getMobileById method
	@GetMapping(value = "/getMobileById/{mobileId}")
	public ResponseStructrure<Mobile> getMobileById(@PathVariable int mobileId) throws IdNotFoundException {
		return mobileService.getMobileById(mobileId);
	}

	// updateMobile method
	@PutMapping(value = "/updateMobile/{mobileId}")
	public ResponseStructrure<Mobile> updateMobile(@RequestBody Mobile mobile, @PathVariable int mobileId) {
		return mobileService.updateMobile(mobile, mobileId);
	}

	// deleteMobile method
	@PostMapping(value = "/deleteMobile/{mobileId}")
	public String deleteMobile(@PathVariable int mobileId) {
		return mobileService.deleteMobile(mobileId);
	}
	
	//displayAllMobile method
		@GetMapping(value = "/displayAllMobile")
		public ResponseStructrure<List<Mobile>> displayMobile(){
		return mobileService.displayMobile();
			}
		
		//saveCollectionMobile method
		@PostMapping(value = "/collectionMobile")
		public List<Mobile> saveCollectionMobile(@RequestBody List<Mobile> mobiles){
			return mobileService.saveCollectionMobile(mobiles);
		}
}