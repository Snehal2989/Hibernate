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

public class Test_update {

	public static void main(String[] args) {
StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		User u= new User();
		Scanner sc= new Scanner(System.in);
		String que1="Update User set user_name =?,user_add=?,user_salary=? where useerid=?";
		Query<User> q1 = s.createQuery(que1);
         q1.setParameter(0,"Monika");
         q1.setParameter(1,"Pune");
         q1.setParameter(2,14500.00);
         q1.setParameter(3,454);
         
        q1.executeUpdate();
        tx.commit();
         
	}

}
