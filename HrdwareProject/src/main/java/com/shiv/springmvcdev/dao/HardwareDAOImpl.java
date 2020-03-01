package com.shiv.springmvcdev.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shiv.springmvcdev.dto.Hardware;

@Repository
public class HardwareDAOImpl implements HardwareDAO {

	@Autowired
	private SessionFactory factory;

	public void saveHardware(Hardware dto) {

		Session session = null;
		try {
			System.out.println("Inside the method -> saveHardware");

			session = factory.openSession();

			System.out.println("Session is opened now...!!!!!");

			session.beginTransaction();

			System.out.println("Transacation has begun...!!!!");

			session.save(dto);

			System.out.println("Saved the data...!!!");

			session.getTransaction().commit();

			System.out.println("Committing the changes...!!!");

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {

			if (Objects.nonNull(dto)) {
				session.close();
			}
		}

//		System.out.println("Inside the method -> saveHardware");
//		
//		Session session = factory.openSession();
//		
//		System.out.println("Session is opened now...!!!!!");
//
//		Transaction tx = session.beginTransaction();
//		
//		System.out.println("Transacation has begun...!!!!");
//
//		session.save(dto);
//		
//		System.out.println("Saved the data...!!!");
//
//		tx.commit();
//		
//		System.out.println("COmmitting the changes...!!!");

	}

	public List<Hardware> getAllHardware() {

		Session session = null;
		List<Hardware> dto = null;
		try {
			System.out.println("Inside the method -> getAllHardware");

			session = factory.openSession();

			System.out.println("Session is opened now...!!!!!");

			Query query = session.getNamedQuery("getListOfHardwareDetails");

			System.out.println("getting the data from db...!!!");
			
			dto = query.list();

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {

			if (Objects.nonNull(dto)) {
				session.close();
			}
		}
		return dto;
	}

}
