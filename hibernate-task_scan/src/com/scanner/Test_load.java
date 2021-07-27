package com.scanner;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test_load {

	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session s=sf.openSession();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the employee id");
		int id= sc.nextInt();
		
		Employee1 emp=s.load(Employee1.class,id);
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmp_mb());
		System.out.println(emp.getEmp_sal());

	}

}
