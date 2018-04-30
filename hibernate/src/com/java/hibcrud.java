package com.java;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibcrud {

	public static void insert() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		employee e=new employee();
		e.setUsername("rajesh");
		e.setPassword("rajesh");
		e.setEmail("rajesh@gmail.com");
		employee e1=new employee();
		e1.setUsername("mohith");
		e1.setPassword("mohith");
		e1.setEmail("mohith@gmail.com");
		session.persist(e);
		session.persist(e1);
		
		transaction.commit();
		
		
	}

}
