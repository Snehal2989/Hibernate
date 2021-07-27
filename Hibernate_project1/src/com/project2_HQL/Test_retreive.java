package com.project2_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Test_retreive {

	public static void main(String[] args) {
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		
//		String s1="from User";
//		Query qu1 = s.createQuery(s1);
//		List<User> rs = qu1.getResultList();
//		for(User info:rs)
//		{
//			System.out.println(info.getUseerid());
//			System.out.println(info.getUser_name());
//			System.out.println(info.getUser_add());
//            System.out.println(info.getUser_salary());
//		}
		
		User u= new User();
		
		String s11=" from User where useerid = ?";
		Query qs = s.createQuery(s11);
		qs.setParameter(0,1258);
		List<User> rs11 = qs.getResultList();
		for(User info :rs11)
		{
			System.out.println(info.getUser_name());
			System.out.println(info.getUser_add());
			System.out.println(info.getUser_salary());
		}
		
		
//		
//		User u1=s.get(User.class,1258);
//	    System.out.println(u1.getUser_name());
//		s.beginTransaction().commit();
		

	}

}
