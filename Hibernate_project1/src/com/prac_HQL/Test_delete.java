package com.prac_HQL;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Utility.Utility;

public class Test_delete {

	public static void main(String[] args) {
		Session ss = Utility.getSession();
		Transaction tx = ss.beginTransaction();

		String s1="Delete from Book where bk_id=:bid";
		
		Query q1 = ss.createQuery(s1);
		q1.setParameter("bid", 1110);
		q1.executeUpdate();
		tx.commit();
	}

}
