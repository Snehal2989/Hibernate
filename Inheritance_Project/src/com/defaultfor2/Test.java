package com.defaultfor2;

import org.hibernate.Session;

import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		Contract_employee ce= new Contract_employee();
		ce.setEid(111);
		ce.setEname("Durgesh");
		ce.setCont_dur("24 Months");
		ce.setPay(25000.00f);
		
		
		Regular_Employee re= new Regular_Employee();
		re.setEid(222);
		re.setEname("Mahesh");
		re.setSal(50000);
		re.setBonus(15200);
		
		s.save(ce);
		s.save(re);
		s.beginTransaction().commit();

	}

}
