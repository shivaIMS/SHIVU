package com.regular.hospitals.controller;

import com.regular.hospitals.dto.HosptialDetailsDTO;
import com.regular.hospitals.service.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;

	public HospitalController() {
		System.out.println("Controller object created");
	}
	
	@PostMapping("/home.do")
	public String savehosp_details(@ModelAttribute HosptialDetailsDTO dto) {
		hospitalService.savehospitalservice(dto);
		return "/home.jsp";
		
	}
}
