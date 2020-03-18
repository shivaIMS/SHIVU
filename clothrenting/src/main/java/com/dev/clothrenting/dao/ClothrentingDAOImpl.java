package com.dev.clothrenting.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev.clothrenting.entity.RegisterEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class ClothrentingDAOImpl implements ClothrentingDAO {

	@Autowired
	private SessionFactory factory;
	
	RegisterEntity entity = new RegisterEntity();

	public void saveRegisterDetails(RegisterEntity regentity) {
		try {
			log.debug("Inside the method ClothrentingDAOImpl() validation for {} ", regentity);

			log.debug("Opening a session...!!!");

			Session session = factory.openSession();

			log.debug("Opening a Transaction...!!!");

			Transaction tx = session.beginTransaction();

			log.debug("Saving a session...!!!");

			session.save(regentity);

			log.debug("Committing the session...!!!");

			tx.commit();

			log.debug("Committed to the database...!!!");

		} catch (Exception e) {
			log.info(" Exception is {} and message is {} ", e, e.getMessage());
			log.error("Inside Catch block");
		}

	}

	public RegisterEntity checkEmailId(String email) {
		try {
			log.debug("Opening a session for checkEmailId ...!!!");

			Session session = factory.openSession();

			log.debug("Saving a session for checkEmailId...!!!");

			entity = session.get(RegisterEntity.class, email);
			
			
		} catch (Exception e) {
		}
		return entity;
		
	}

	

}
