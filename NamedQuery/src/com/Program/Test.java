package com.Program;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Hibernate.Util.HibernateUtil;

public class Test {
// here add setting of secondry cache, if want to run unable the setting
	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		
		User u = new User();
		
		//for all record
		List<User> Us = s.getNamedQuery("Data_fetch").getResultList();
		for(User User_info:Us)
		{
			System.out.println(User_info);
		}
		
		//for single record
		//User res = (User) s.getNamedQuery("Single_record").getSingleResult();  or 
		//List<User> res = (List<User>) s.getNamedQuery("Single_record").getSingleResult();
		Query qry = s.getNamedQuery("Single_record");
		     qry.setParameter("ud",102);
		     User res = (User)qry.getSingleResult();
              System.out.println(res);
              
             Query query1 = s.getNamedQuery("Update_name");
                  query1.setParameter("un", "Ash");
                  query1.setParameter("ud",101);
                 query1.executeUpdate();
                  tx.commit();
	}

}
