package com.Single_scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate_ulit {
	
	private static StandardServiceRegistry registry;
	
	private static SessionFactory sesfac;
	
	public static SessionFactory getsession()
	{
		if(sesfac==null)
		{
			registry= new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources mds= new MetadataSources(registry);
			Metadata md=mds.getMetadataBuilder().build();
			sesfac=md.getSessionFactoryBuilder().build();
			Session s= sesfac.openSession();
		}
		
		return sesfac;
	}

}
