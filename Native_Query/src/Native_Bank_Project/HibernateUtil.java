package Native_Bank_Project;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Access;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

//import com.program.Employee;

//import Native_curd_project.Libraray;









public class HibernateUtil {

	private static StandardServiceRegistry registry;
	
	private static SessionFactory sessfact;
	
	public static SessionFactory getSession()
	{
		if(sessfact==null)
		{
			Map<String,Object> setting= new HashMap<String,Object>();
			setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost:3306/native_bank_proj");
			setting.put(Environment.USER,"root");
			setting.put(Environment.PASS, "root");
			setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			setting.put(Environment.HBM2DDL_AUTO,"update");
			setting.put(Environment.SHOW_SQL,"true");
			
			registry= new StandardServiceRegistryBuilder().applySettings(setting).build();
			
			MetadataSources mds= new MetadataSources(registry);
		           //   mds.addAnnotatedClass(Course.class);
		            // mds.addAnnotatedClass(Faculty.class);
		            // mds.addAnnotatedClass(Student.class);
		            mds.addAnnotatedClass(Account.class);
		                    
		                   
		    Metadata md= mds.getMetadataBuilder().build();
		    sessfact=md.getSessionFactoryBuilder().build();
		    
		}
		return sessfact;
}
}
