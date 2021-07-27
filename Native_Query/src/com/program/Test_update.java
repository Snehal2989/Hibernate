package com.program;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import HibernateUtil.HibernateUtil;

public class Test_update {

	public static void main(String[] args) {
		 Session ss = HibernateUtil.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		//Query<Employee> query = ss.createNativeQuery("update Employee set ename='Divya' where eid=102", Employee.class);
            
	
		
		NativeQuery<Employee> query = ss.createNativeQuery("Update Employee set ename=:name where eid=:id", Employee.class);
		query.setParameter("name","Durga");
		query.setParameter("id",103);
		
		
		query.executeUpdate();
		tx.commit();
		
		
		
            
	}

}
