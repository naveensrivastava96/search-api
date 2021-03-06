package com.nagarro.training.java.assignment11.hibernateUtil;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateSessionFactory {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public SessionFactory getSessionFactory() {
		if (entityManagerFactory.unwrap(SessionFactory.class) == null)
			throw new NullPointerException();
		return entityManagerFactory.unwrap(SessionFactory.class);
	}

}
