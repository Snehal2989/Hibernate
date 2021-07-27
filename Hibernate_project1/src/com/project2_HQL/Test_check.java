package com.project2_HQL;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
                                    //nahi jamla
public class Test_check {

	public static void main(String[] args) {
StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		User u= new User();
		Scanner sc = new Scanner(System.in);
		
		String query="From User check user_name=?,user_add=?";
		Query<User> q1 = s.createQuery(query);
	
		q1.setParameter(0,"Monika");
		q1.setParameter(1,"Pune");
		//q1.setParameter(0,454);
		
		q1.executeUpdate();
		tx.commit();
	}

}
