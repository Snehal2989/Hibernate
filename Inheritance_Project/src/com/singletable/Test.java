package com.singletable;

import org.hibernate.Session;


import com.util.HibernateUtil;



public class Test {
	
	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		Book bk= new Book();
		bk.setBid(1211);
		bk.setPid(123456);
		bk.setName("CommunicationBook");
		bk.setAuthor("Leon");
	
		
		Pen p = new Pen();
		p.setPid(1111);
		p.setName("Reylond");
		p.setColor("Blue");
		
		s.save(bk);
		s.save(p);
		s.beginTransaction().commit();
	}

}
