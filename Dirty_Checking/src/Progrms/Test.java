package Progrms;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
        User u= new User();
//        u.setUid(12121);
//        u.setUname("Raj");       // First approach
//        u.setUsal("15000");
//        s.saveOrUpdate(u);
//        tx.commit();
		
		
//		u.setUname("Dipak");
        
//        u.setUid(12121);
//        u.setUname("Mahesh"); //here only updating name but all fields are updated,its a dirty checking
//		  s.saveOrUpdate(u);
//		  tx.commit();
		
		User u1 = s.get(User.class,1213);
		u1.setUname("Kiran");
		 s.saveOrUpdate(u1);   
		 tx.commit();// here setting only name other fields r same, here v are not  by using update().
		// if u dont want to set other fields then use @Dynamic update due to that only set particular field

	
	
	}

}
