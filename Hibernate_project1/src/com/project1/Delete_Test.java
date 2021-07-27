package com.project1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Delete_Test {

	public static void main(String[] args) {
StandardServiceRegistry regitry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(regitry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session session= sf.openSession();
		
		Scanner sc= new Scanner(System.in);
		User u = new User();
		
		System.out.println("Enter the user id");
		int num=sc.nextInt();
		u.setUseerid(num);
		session.delete(u);
		
		session.beginTransaction().commit();
	}

}
