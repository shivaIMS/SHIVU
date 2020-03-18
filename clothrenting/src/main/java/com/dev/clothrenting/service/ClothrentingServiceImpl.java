package com.dev.clothrenting.service;

import java.util.HashMap;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.clothrenting.dao.ClothrentingDAO;
import com.dev.clothrenting.dto.RegisterDTO;
import com.dev.clothrenting.entity.RegisterEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClothrentingServiceImpl implements ClothrentingService {
	
	@Autowired
	private ClothrentingDAO  clothrentingDAO;
	public HashMap<String, Object> validation(RegisterDTO dto) {

		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		try {

			String email = dto.getEmail();
			String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
			boolean flag = email.matches(EMAIL_REGEX);
			log.debug("Check the name {}",dto.getFirstName().equals(null));
			log.debug("Get the first name {}",dto.getFirstName());
			if ((dto.getFirstName().trim().equals(null) || dto.getFirstName().trim().equals(""))) {
				hashmap.put("FirstNameorShopName", "First name and Company name can't be null");
				hashmap.put("isValid", false);
			}
			if ((dto.getEmail().trim().equals(null) || dto.getEmail().trim().equals("")) || flag==false) {
				hashmap.put("email", "Invliad email id...Re-enter your mail id and try again...!!!");
				hashmap.put("isValid", false);
			}
			if ((dto.getPhoneNumber().trim().equals(null) || dto.getPhoneNumber().trim().equals(""))) {
				hashmap.put("phoneno", "phone number must have 10 digits");
				hashmap.put("isValid", false);
			}
			if ((dto.getAddress().trim().equals(null) || dto.getAddress().trim().equals(""))) {
				hashmap.put("address", "address can't be null");
				hashmap.put("isValid", false);
			}
			if ((dto.getStreet().trim().equals(null) || dto.getStreet().trim().equals(""))) {
				hashmap.put("street", "street can't be null");
				hashmap.put("isValid", false);
			}
			if ((dto.getState().trim().equals(null) || dto.getState().trim().equals(""))) {
				hashmap.put("state", "state can't be null");
				hashmap.put("isValid", false);
			}
			if ((dto.getLandMark().trim().equals(null) || dto.getLandMark().trim().equals(""))) {
				hashmap.put("landmark", "landmark can't be null");
				hashmap.put("isValid", false);
			}
			if ((dto.getCity().trim().equals(null) || dto.getCity().trim().equals(""))) {
				hashmap.put("city", "city can't be null");
				hashmap.put("isValid", false);
			}
			
			if(!dto.getEmail().equals("")) {
				RegisterEntity entity = clothrentingDAO.checkEmailId(dto.getEmail());
				
				if(entity!=null) {
					hashmap.put("emailExists", "Email already existis,,,!!!!");
					hashmap.put("isValid",false);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Exception caught");
		}

		return hashmap;
	}

	public void saveRegisterDetails(RegisterDTO dto) {
		RegisterEntity entity = new RegisterEntity();
		BeanUtils.copyProperties(dto, entity);
		clothrentingDAO.saveRegisterDetails(entity);
	}
	
	

}
