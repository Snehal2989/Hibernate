package com.scanner;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test_delete {

	public static void main(String[] args) {
StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		
		Scanner sc= new Scanner(System.in);
		Employee1 e1= new Employee1();
		System.out.println("Enter the employee id");
		int id= sc.nextInt();
		e1.setEmp_id(id);
		s.delete(e1);
		s.beginTransaction().commit();

	}

}
