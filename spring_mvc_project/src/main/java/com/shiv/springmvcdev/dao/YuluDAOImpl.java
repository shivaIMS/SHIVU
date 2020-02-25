package com.shiv.springmvcdev.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shiv.springmvcdev.dto.YuluDTO;


@Repository
public class YuluDAOImpl implements YuluDAO {
	
	@Autowired
	private SessionFactory factory;

	public void saveYuluDetails(YuluDTO dto) {
		
		System.out.println("Inside saveYuluDetails Method...!!!");
		
		Session session = factory.openSession();
		
		System.out.println("Session Created and about the begin the transaction...!!!");
		
		Transaction tx = session.beginTransaction();
		
		System.out.println("Going to save the dto object...!!!");
		
		session.save(dto);
		
		System.out.println("Good one Shiv...!!! Your DTO has been saved successfully...!!!");
		
		tx.commit();
		
		System.out.println("The database has been updated successfully...!!!");
		
		
	}

	
}
