package com.multiple_list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
	StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
	
	MetadataSources mds= new MetadataSources(registry);
	
	Metadata md=mds.getMetadataBuilder().build();
	
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	
	Session session=sf.openSession();
    
	Student s= new Student();
//	s.setSid(100);
//	s.setSname("Ragini");
//	s.setSaddr("Nagar");
//	
//	session.save(s);
//	session.beginTransaction().commit();
	
	List<Student> stulist=session.createQuery("From Student").getResultList();
	for(Student info: stulist)
	{
		System.out.println(info.getSid());
		System.out.println(info.getSname());
		System.out.println(info.getSaddr());
	}
	
	
			
	
	}

}
