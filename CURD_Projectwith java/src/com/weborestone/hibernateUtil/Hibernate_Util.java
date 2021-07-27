package com.weborestone.hibernateUtil;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.weborestone.model.Product;

public class Hibernate_Util {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sesfac;
	
	public static SessionFactory getSession()
	{
		if(sesfac==null)
		{
			Map<String,Object> setting= new HashMap<String,Object>();
			setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost:3306/hiber");
			setting.put(Environment.USER,"root");
			setting.put(Environment.PASS,"root");
			setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
			setting.put(Environment.HBM2DDL_AUTO,"update");
			setting.put(Environment.SHOW_SQL,"true");
			
			registry= new StandardServiceRegistryBuilder().applySettings(setting).build();
			MetadataSources mds= new MetadataSources(registry);
			mds.addAnnotatedClass(Product.class);
		
		    Metadata md=mds.getMetadataBuilder().build();
		    
		    sesfac=md.getSessionFactoryBuilder().build();
		    
		   
		
		}
		return sesfac;
	}

}
