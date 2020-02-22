package com.regular.hospitals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regular.hospitals.dao.HospitalDAO;
import com.regular.hospitals.dto.HosptialDetailsDTO;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	
	@Autowired
	private HospitalDAO hospitaldao;
	

	public void savehospitalservice(HosptialDetailsDTO hosptialDetailsDTO) {
		
		hospitaldao.savehospitaldetails(hosptialDetailsDTO);
				
	}
	
	

}
