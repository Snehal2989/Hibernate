package Hibernate.Util;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Access;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
//import org.hibernate.cache.ehcache.EhCacheRegionFactory;
import com.Program.User;










public class HibernateUtil {

	private static StandardServiceRegistry registry;
	
	private static SessionFactory sessfact;
	
	public static SessionFactory getSession()
	{
		if(sessfact==null)
		{
			Map<String,Object> setting= new HashMap<String,Object>();
			setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost:3306/Named_Query");
			setting.put(Environment.USER,"root");
			setting.put(Environment.PASS, "root");
			setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			setting.put(Environment.HBM2DDL_AUTO,"update");
			setting.put(Environment.SHOW_SQL,"true");
			setting.put(Environment.USE_SECOND_LEVEL_CACHE,"true");
			setting.put(Environment.CACHE_REGION_FACTORY, " org.hibernate.cache.ehcache.EhCacheRegionFactory");
			
			registry= new StandardServiceRegistryBuilder().applySettings(setting).build();
			
			MetadataSources mds= new MetadataSources(registry);
		            mds.addAnnotatedClass(User.class);
		            // mds.addAnnotatedClass(Faculty.class);
		            // mds.addAnnotatedClass(Student.class);
		            //mds.addAnnotatedClass(Libraray.class);
		                    
		                   
		    Metadata md= mds.getMetadataBuilder().build();
		    sessfact=md.getSessionFactoryBuilder().build();
		    
		}
		return sessfact;
}
}
