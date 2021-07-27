package com.program;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import HibernateUtil.HibernateUtil;

public class Test_fetch {

	public static void main(String[] args) {
		Session ss = HibernateUtil.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		 NativeQuery<Employee> query = ss.createNativeQuery("Select * from Employee where eid=:e_id",Employee.class);
        
		query.setParameter("e_id",103);
		Employee emp = query.getSingleResult();
		System.out.println(emp);
		//query.executeUpdate();
		tx.commit();
	}

}
