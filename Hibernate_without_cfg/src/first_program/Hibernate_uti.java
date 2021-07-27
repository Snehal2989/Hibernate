package first_program;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class Hibernate_uti {

	private static StandardServiceRegistry registry;
	private static SessionFactory sesfac;
	
	public static SessionFactory getses()
	{
		if(sesfac==null)
		{
			Map<String,Object> setting=new HashMap<String,Object>();
			
			setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost:3306/hiber");
			setting.put(Environment.USER,"root");
			setting.put(Environment.PASS,"root");
			setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			setting.put(Environment.HBM2DDL_AUTO, "update");
			setting.put(Environment.SHOW_SQL,"true");
			
			registry= new StandardServiceRegistryBuilder().applySettings(setting).build();
			
			MetadataSources mds=new MetadataSources(registry);
			mds.addAnnotatedClass(Employee.class);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sesfac=md.getSessionFactoryBuilder().build();
		}
		
		return sesfac;
	}
	
}
