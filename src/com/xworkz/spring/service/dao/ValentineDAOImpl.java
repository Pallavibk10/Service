package com.xworkz.spring.service.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;


import com.xworkz.spring.service.entity.ValentineEntity;

@Component
public class ValentineDAOImpl implements ValentineDAO {

	@Override
	public Integer save(ValentineEntity entity) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			cfg.addAnnotatedClass(ValentineEntity.class);
			SessionFactory factory = cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			Transaction tx = session.getTransaction();
			tx.commit();
			session.close();
		    factory.close();
		    System.out.println("Data stored in database");
		    
			System.out.println("dao implement start");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	


}
