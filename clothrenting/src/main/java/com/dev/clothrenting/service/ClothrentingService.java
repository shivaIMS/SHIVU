package com.dev.clothrenting.service;

import java.util.HashMap;
import java.util.Map;

import com.dev.clothrenting.dto.RegisterDTO;
import com.dev.clothrenting.entity.RegisterEntity;

public interface ClothrentingService {

	HashMap<String, Object> validation(RegisterDTO dto);
	
	public void saveRegisterDetails(RegisterDTO dto);
	
}
