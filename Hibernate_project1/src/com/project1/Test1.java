package com.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test1 {

	public static void main(String[] args) {
		StandardServiceRegistry regitry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(regitry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session session= sf.openSession();
		
		User u= new User();
		u.setUseerid(156);
		u.setUser_name("Rakesh");
		u.setUser_add("Bhopal");
		u.setUser_salary(12500);
		
		session.save(u);
		session.beginTransaction().commit();
		

	}

}
