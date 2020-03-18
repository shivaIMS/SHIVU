package com.dev.clothrenting.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.clothrenting.dto.RegisterDTO;
import com.dev.clothrenting.entity.RegisterEntity;
import com.dev.clothrenting.service.ClothrentingService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class RegisterController {
	
	@Autowired
	private ClothrentingService service;

	public RegisterController() {
		log.info("{} is Created..", this.getClass().getSimpleName());
	}

	@GetMapping("/reg.do")
	public String getRegPage() {
		log.info("getRegPage() is Created.. {}");
		return "registrationform.jsp";
	}

	@GetMapping("/login.do")
	public String getLoginPage() {
		log.info("getLoginPage() is Created.. {}");

		return "loginform.jsp";
	}

	@PostMapping("/saveUserDetails.do")
	public String saveUserInfo(@ModelAttribute RegisterDTO dto, Model model) {
		try {
			if (Objects.nonNull(dto)) {
				
				HashMap<String, Object> map = service.validation(dto);
				log.info("MAP IS {}",map);
				if((Boolean)map.get("isvalid")==null) {
				service.validation(dto);
				service.saveRegisterDetails(dto);
				log.debug("Inside try block--saveUserInfo method");
				log.info("dto is {} ", dto);
				model.addAttribute("invlidData", map);
				}
			}
			
		} catch (Exception e) {
			log.error("message is {} and exception is {}", e.getMessage(),e);
			log.error("Inside catch block...!!!");
		}
		 return "registrationform.jsp";
	}
	
	
}
