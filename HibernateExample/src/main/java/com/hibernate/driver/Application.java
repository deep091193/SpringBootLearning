package com.hibernate.driver;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Address;
import com.hibernate.model.HomeAddress;
import com.hibernate.model.OfficeAddress;
import com.hibernate.model.Person;

public class Application {
   
     
	public static void main(String[] args) {
		  Person person = new Person();
		  person.setFirstName("Rahul");
		  person.setLastName("Das");
		  person.setAge(30);
		  
		  Address address = new HomeAddress();
		  address.setCity("Kolkata");
		  address.setPincode(700111);
		  
		  Address address2 = new OfficeAddress();
		  address2.setCity("Kolkata");
		  address2.setPincode(700091);
		  List<Address> addresses = new ArrayList<Address>();
		  addresses.add(address);
		  addresses.add(address2);
		  person.setAddr(addresses);
		  
		  
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		  Session session = sessionFactory.getCurrentSession();
		  session.beginTransaction();
		  
		  session.save(person);
		  session.save(address);
		  session.save(address2);
		  session.getTransaction().commit();
		  
		  
		  
	}
}
