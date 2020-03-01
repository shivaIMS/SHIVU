package com.shiv.springmvcdev.service;

import java.util.List;

import com.shiv.springmvcdev.dto.Hardware;

public interface hardwareServices {

	
	public void hardwareService(Hardware dto);

	public List<Hardware> getAllHardwareDetails();
	
}
