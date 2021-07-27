package com.scanner;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds = new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		Scanner sc= new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			Employee1 e1=new Employee1();
			
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			System.out.println("Enter the employee name");
			String name=sc.next();
			System.out.println("Enter the mobile number");
			long mb=sc.nextLong();
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();
			
			e1.setEmp_id(id);
			e1.setEmp_name(name);
			e1.setEmp_mb(mb);
			e1.setEmp_sal(sal);
			
			System.out.println(e1.getEmp_id());
			System.out.println(e1.getEmp_name());
			System.out.println(e1.getEmp_mb());
			System.out.println(e1.getEmp_sal());
			
			s.save(e1);
			s.beginTransaction().commit();
			
		}
		
		
		

	}

}
