package com.spring.ORM.Controllers;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.person;

@Controller
public class HomeController {

	@GetMapping("/home")
    public String homeController() {

		return "home";
	    }
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration()
	{
		return "registration";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(HttpServletRequest request, Model model)
	{
		person person = new person();
Configuration con = new Configuration().configure().addAnnotatedClass(person.class);
		
		StandardServiceRegistryBuilder serviceRegisteryBuilder = new StandardServiceRegistryBuilder();
        ServiceRegistry serviceRegistry = serviceRegisteryBuilder.applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
		person.setPerson_name(request.getParameter("person_name")); 
		person.setPerson_age(Integer.parseInt(request.getParameter("person_age"))); 
		person.setPerson_address(request.getParameter("person_address")); 
		person.setPerson_zipcode(request.getParameter("person_zipcode")); 
		person.setPerson_mail(request.getParameter("person_mail")); 
        
        model.addAttribute("signup", person);
        session.save(person);
        tx.commit();
        sf.close();
		return "signup";
	}
	
	@GetMapping("/participants")
	public String participants(Model model)
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(person.class);
		
		StandardServiceRegistryBuilder serviceRegisteryBuilder = new StandardServiceRegistryBuilder();
        ServiceRegistry serviceRegistry = serviceRegisteryBuilder.applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(serviceRegistry);
		Session session = sf.openSession();
	 
	   TypedQuery<person> query = session.createQuery("SELECT a FROM person a", person.class);
	   List<person> persons = query.getResultList();
	   model.addAttribute("person", persons);
        sf.close();
		return "participants";
	}
	
	@GetMapping("/about")
    public String about() {

		return "about";
	    }
	
}
