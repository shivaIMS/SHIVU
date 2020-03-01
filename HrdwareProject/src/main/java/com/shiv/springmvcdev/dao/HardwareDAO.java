package com.shiv.springmvcdev.dao;

import java.util.List;

import com.shiv.springmvcdev.dto.Hardware;

public interface HardwareDAO {
	
	
	public void saveHardware(Hardware dto);
//	public  getHardwareDetails(Hardware dto);

	public List<Hardware>  getAllHardware();

}
