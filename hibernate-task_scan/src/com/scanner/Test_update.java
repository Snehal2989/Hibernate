package com.scanner;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test_update {

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
//		System.out.println("enter the updated id");
//		int setid=sc.nextInt();     v cant update id (primary key)

		e1.setEmp_id(id);
		
		
		System.out.println("Enter the updated name");
		String name=sc.next();
		e1.setEmp_name(name);
		System.out.println("Enter the updated mob");
		long mb=sc.nextLong();
		e1.setEmp_mb(mb);
		System.out.println("Enter the updated salary");
		double sal=sc.nextDouble();
		e1.setEmp_sal(sal);
		
		
		s.update(e1);
		s.beginTransaction().commit();

	}

}
