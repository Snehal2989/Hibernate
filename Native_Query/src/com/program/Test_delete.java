package com.program;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import HibernateUtil.HibernateUtil;

public class Test_delete {

	public static void main(String[] args) {
		Session ss = HibernateUtil.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		NativeQuery<Employee> query = ss.createNativeQuery("Delete from Employee where eid=?",Employee.class);

		query.setParameter(1,102);
		query.executeUpdate();
		tx.commit();
	}

}
