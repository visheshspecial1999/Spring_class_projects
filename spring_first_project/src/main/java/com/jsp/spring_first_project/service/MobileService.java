package com.jsp.spring_first_project.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.spring_first_project.dao.MobileDao;
import com.jsp.spring_first_project.dto.Mobile;
import com.jsp.spring_first_project.dto.ResponseStructrure;
import com.jsp.spring_first_project.exception.IdNotFoundException;
@Service
public class MobileService {

	@Autowired
	MobileDao mobileDao;
	@Autowired
	ResponseStructrure<Mobile> responseStructrure;
	@Autowired
	ResponseStructrure<List<Mobile>> responseStructrure2;

	// saveMobile method
	public Mobile saveMobile(Mobile mobile) {
		return mobileDao.saveMobile(mobile);
	}
	
	// getMobileById method
		public ResponseStructrure<Mobile> getMobileById(int mobileId) throws IdNotFoundException {
			Mobile mobile= mobileDao.getMobileById(mobileId);
			if(mobile!=null) {
				responseStructrure.setStatusCode(HttpStatus.FOUND.value());
				responseStructrure.setStatusMessage("Given id is present");
				responseStructrure.setData(mobile);
				return responseStructrure;
			}
			else {
//				responseStructrure.setStatusCode(HttpStatus.NOT_FOUND.value());
//				responseStructrure.setStatusMessage("Given id is not present");
//				responseStructrure.setData(mobile);
//				return responseStructrure;
				throw new IdNotFoundException("given id is not present please check");
			}
		}
		
		// updateMobile method
		public ResponseStructrure<Mobile> updateMobile(Mobile mobile, int mobileId) {
		Mobile mobile2= mobileDao.updateMobile(mobile, mobileId);
		if(mobile2!=null) {
			responseStructrure.setStatusCode(HttpStatus.FOUND.value());
			responseStructrure.setStatusMessage("data-updated");
			responseStructrure.setData(mobile2);
			return responseStructrure;
		}
		else {
			responseStructrure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructrure.setStatusMessage("data-not-updated");
			responseStructrure.setData(null);
			return responseStructrure;
		}
		}
		
		// deleteMobile method
		public String deleteMobile(int mobileId) {
			return mobileDao.deleteMobile(mobileId);
		}
		
		//displayAllMobile method
		public ResponseStructrure<List<Mobile>> displayMobile(){
			List<Mobile> list= mobileDao.displayMobile();
			if(list!=null) {
			responseStructrure2.setStatusCode(HttpStatus.FOUND.value());
			responseStructrure2.setStatusMessage("Data-Present");
			responseStructrure2.setData(list);
			return responseStructrure2;
			}
			else {
				responseStructrure2.setStatusCode(HttpStatus.NOT_FOUND.value());
				responseStructrure2.setStatusMessage("Data-not-Present");
				responseStructrure2.setData(null);
				return responseStructrure2;
			}
		}
		
		//saveCollectionMobile method
		public List<Mobile> saveCollectionMobile(List<Mobile> mobiles){
			return mobileDao.saveCollectionMobile(mobiles);
		}
}