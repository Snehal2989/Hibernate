package com.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Utility {
	
	public static Session s=null;
	public static Session getSession()
	{
       StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		 s= sf.openSession();
		
		return s;
		
	}

}
