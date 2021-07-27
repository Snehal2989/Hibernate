package com.project2_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Test_delete {

	public static void main(String[] args) {
StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf= md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		User u= new User();
		String query="Delete from User where useerid=?";
		Query<User>  q = s.createQuery(query);
		q.setParameter(0,101);
		q.executeUpdate();
		tx.commit();

	}

}
