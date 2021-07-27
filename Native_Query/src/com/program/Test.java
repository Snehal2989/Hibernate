package com.program;

import java.util.List;

import org.hibernate.Session;

import HibernateUtil.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session ss = HibernateUtil.getSession().openSession();
		
		List<Employee> lst = ss.createNativeQuery("select * from Employee", Employee.class).getResultList();
		for(Employee e:lst)
		{
			System.out.println(e);
		}
     
	}

}
