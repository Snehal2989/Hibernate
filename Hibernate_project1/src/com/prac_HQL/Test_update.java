package com.prac_HQL;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Utility.Utility;

public class Test_update {

	public static void main(String[] args) {
	
		Session ss = Utility.getSession();
		Transaction tx = ss.beginTransaction();

		 String s1="Update Book set bk_name=?,bk_author=? where bk_id=:bid";
		 
		 Query q1 = ss.createQuery(s1);
		 
		 q1.setParameter(0,"HalfGf");
		 q1.setParameter(1,"Chetan Bhagat");
		 q1.setParameter("bid",5555);
		
		 q1.executeUpdate();
		 tx.commit();
	}

}
