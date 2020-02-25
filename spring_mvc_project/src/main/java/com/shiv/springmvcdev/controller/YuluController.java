package com.shiv.springmvcdev.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shiv.springmvcdev.dto.YuluDTO;
import com.shiv.springmvcdev.service.ServiceDAO;


@Controller
@RequestMapping("/")
public class YuluController {

	@Autowired
	private ServiceDAO service;
	
	public YuluController() {
		System.out.println("Created constructor for YuluController . . . ! ! ! ! ");
	}
	
	@PostMapping("/home.do")
	public String saveYuluDetails(@ModelAttribute  YuluDTO dto, HttpServletRequest request) {
		
		if(Objects.nonNull(dto)) {
			System.out.println(dto);
			service.saveService(dto);
			
			request.setAttribute("Key", dto.getLocation());
		} else {
			System.out.println("OOOOPPPSSSS...!!!! SOMETHING WENT WRONG....!!!!!");
		}
		
		return "/index.jsp";
		
	}
	
	//Create a get all list method to display in UI
	
	//Update the data in DB and display the updated Data
	
	//Delete few recrods and verifiy the same
	
	//Get Data by Id
	
	
}
