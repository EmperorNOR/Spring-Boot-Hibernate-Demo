package com.spring.ORM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.person;

@SpringBootApplication
public class OrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmApplication.class, args);
		//person person = new person();
		//person.setPerson_name("Markus");
		//person.setPerson_age(26);
		//person.setPerson_address("Bjerkely 10");
		
		//Configuration con = new Configuration().configure().addAnnotatedClass(person.class);
		
		//StandardServiceRegistryBuilder serviceRegisteryBuilder = new StandardServiceRegistryBuilder();
        //ServiceRegistry serviceRegistry = serviceRegisteryBuilder.applySettings(con.getProperties()).build();
		
		//SessionFactory sf = con.buildSessionFactory(serviceRegistry);
		
	
		
		
		//Session session = sf.openSession();
		
		//Transaction tx = session.beginTransaction();
		//session.save(person);
		
		//person = (person)session.get(person.class, 1);
		//System.out.println(person);
		//tx.commit();
	}

}
