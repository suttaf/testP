package com.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExecHiber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SessionFactory in Hibernate 5 example
		  Configuration config = new Configuration();
		  config.configure();
		  // local SessionFactory bean created
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  Session session = sessionFactory.getCurrentSession();

	}

}
