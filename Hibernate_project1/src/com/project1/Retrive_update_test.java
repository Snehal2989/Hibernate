package com.project1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Retrive_update_test {

	public static void main(String[] args) {
StandardServiceRegistry regitry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(regitry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session session= sf.openSession();
		
		Scanner sc= new Scanner(System.in);
		User u=session.get(User.class, 156);
		System.out.println("User id is "+u.getUseerid());
		System.out.println("User name is "+ u.getUser_name());
		System.out.println("User address is "+ u.getUser_add());
		System.out.println("User Salary is "+ u.getUser_salary());
		
		session.beginTransaction().commit();
		
		System.out.println("Enter the user id");
		int num=sc.nextInt();
		u.setUseerid(num);
		System.out.println("Enter the name u have to update ");
		String name= sc.next();
		u.setUser_name(name);
		System.out.println("Enter the address u have to update ");
		String addr= sc.next();
		u.setUser_add(addr);
		System.out.println("Enter the salary u have to update ");
		double sal=sc.nextDouble();
		u.setUser_salary(sal);
		
		
		session.update(u);
		session.beginTransaction().commit();
		
		
		
		
		
		
		
		

	}

}
