package com.dev.clothrenting.dao;

import com.dev.clothrenting.dto.RegisterDTO;
import com.dev.clothrenting.entity.RegisterEntity;

public interface ClothrentingDAO {
	
	
	public void saveRegisterDetails(RegisterEntity entity);
	
	public RegisterEntity checkEmailId(String email);
}
