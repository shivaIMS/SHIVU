package com.regular.hospitals.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.regular.hospitals.dto.HosptialDetailsDTO;


@Repository
public class HosptialDAOImpl implements HospitalDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public HosptialDAOImpl() {
		System.out.println("Hospital Object is Created");
	}

	public void savehospitaldetails(HosptialDetailsDTO hospitalDetailsdto) {
		
		System.out.println("Opened session");
		
		Session session=factory.openSession();
		
		System.out.println("Transaction is started");
		
		Transaction tx = session.beginTransaction();
		
		System.out.println("Storing Data");
		
		session.save(hospitalDetailsdto);
		
		System.out.println("Stored Data");
		
		tx.commit();
		
		System.out.println("Saved in the Database");
		
	}

}
