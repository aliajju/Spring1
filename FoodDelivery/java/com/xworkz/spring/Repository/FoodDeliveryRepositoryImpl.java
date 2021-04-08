package com.xworkz.spring.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.spring.Entity.FoodDeliveryEntity;

public class FoodDeliveryRepositoryImpl  implements FoodDeliveryRepositor{
	
	public FoodDeliveryRepositoryImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created Repositiory impl" + this.getClass().getName());
	}

	@Override
	public void save(FoodDeliveryEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked into FoodDeliveryEntity" + entity);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}
	
	

}
