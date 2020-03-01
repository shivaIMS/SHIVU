package com.shiv.springmvcdev.controller;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiv.springmvcdev.dto.Hardware;
import com.shiv.springmvcdev.service.hardwareServices;

import javassist.expr.NewArray;

@Controller
@RequestMapping("/")
public class HardwareController {

	@Autowired
	private hardwareServices service;

	@PostMapping("/hardware.do")
	public ModelAndView insert(@ModelAttribute Hardware dto) {
		System.out.println("Inside controller...!!!");
		try {
			if (dto.getName() != "") {
				System.out.println("Inside IF & before service.hardwareService(dto) method...!!!");
				service.hardwareService(dto);
				System.out.println("Done with  service.hardwareService(dto) !!!");
				return new ModelAndView("success.jsp", "name", dto.getName());
			} else {

				return new ModelAndView("failure.jsp", "dataNotFound", "Please Enter the valid data...!!!");
			}

		} catch (HibernateException e) {

			e.printStackTrace();

		}
		return new ModelAndView("redirect:/hardware.do");

//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/home.jsp");
//		mv.addObject(dto);
//		return mv;

	}

	@GetMapping("/view.do")
	public ModelAndView getHardwareDetails() {

		System.out.println("Inside getHardwareDetails() ");
		List<Hardware> hardwares = service.getAllHardwareDetails();
		for (Hardware hardware : hardwares) {
			System.out.println("Inside for each loop");
			System.out.println(hardware);
		}
		return new ModelAndView("view.jsp", "hardwares", hardwares);
	}

}
