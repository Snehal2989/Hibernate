package com.program;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import Hibernate.Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		User u1= new User();
		 List<User> list = s.getNamedNativeQuery("data_all").getResultList();
		 for(User u:list)
		 {
			 System.out.println(u);
		 }
		 
	}

}
