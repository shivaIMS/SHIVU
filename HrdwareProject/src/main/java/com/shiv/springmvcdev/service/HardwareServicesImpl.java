package com.shiv.springmvcdev.service;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiv.springmvcdev.dao.HardwareDAO;
import com.shiv.springmvcdev.dto.Hardware;

@Service
public class HardwareServicesImpl implements hardwareServices {

	@Autowired
	private HardwareDAO hardwaredao;

	public void hardwareService(Hardware dto) {

		if (Objects.nonNull(dto)) {
			hardwaredao.saveHardware(dto);
		}

	}

	public List<Hardware> getAllHardwareDetails() {
		List<Hardware> hardwares = null;
		try {
			hardwares = hardwaredao.getAllHardware();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return hardwares;
	}

}
