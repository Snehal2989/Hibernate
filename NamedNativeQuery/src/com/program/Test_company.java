package com.program;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import Hibernate.Util.HibernateUtil;

public class Test_company {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
             Transaction tx = s.beginTransaction();
             Company cp=new Company();
//             cp.setCid(125);
//             cp.setCname("Cg");
//             cp.setLocation("Hinjewadi");
//             s.save(cp);
            
		     Company result = (Company)s.getNamedNativeQuery("Single_data").setParameter("cd",122).getSingleResult();
	          System.out.println(result);
	          
	          NativeQuery para = s.getNamedNativeQuery("Update_data").setParameter("cn","Tcs").setParameter("cd",121);
	          para.executeUpdate();       //first time its update the value previously it was tata now tcs
	          
	          
	          NativeQuery para2 = s.getNamedNativeQuery("Update_data").setParameter("cn","Infocept").setParameter("cd",122);
	          para2.executeUpdate();    // again it set the value
             tx.commit();
	
	}

}
