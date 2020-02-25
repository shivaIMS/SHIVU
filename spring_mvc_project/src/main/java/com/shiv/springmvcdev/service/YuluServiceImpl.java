package com.shiv.springmvcdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiv.springmvcdev.dao.YuluDAO;
import com.shiv.springmvcdev.dto.YuluDTO;


@Service
public class YuluServiceImpl implements ServiceDAO {
	
	@Autowired
	private YuluDAO service;
	
	
	public void saveService(YuluDTO dto) {
		
		service.saveYuluDetails(dto);
		
	}
	
	

}
