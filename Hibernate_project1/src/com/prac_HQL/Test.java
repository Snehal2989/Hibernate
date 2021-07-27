package com.prac_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		
		Book b=new Book();
		b.setBk_id(5555);
		b.setBk_name("Power Electronics");
		b.setBk_author("Threja");
		
		s.saveOrUpdate(b);//if data is not present then it insert it , and if data is present then update it.
		
		s.persist(b); //  this is used for saving purpose
		s.beginTransaction().commit();
		

	}

}
