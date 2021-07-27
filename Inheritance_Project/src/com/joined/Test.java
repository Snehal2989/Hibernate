package com.joined;

import org.hibernate.Session;

import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		Book b= new Book();
		b.setBid(2225);
		b.setPid(548484654);
		b.setPname("Book of Electrical");
		b.setAuthor("B.L.Thereja");
		
		Pen p= new Pen();
		p.setPid(45454654);
		p.setPname("Lexi");
		p.setColor("Black");
		
		s.save(b);
		s.save(p);
		s.beginTransaction().commit();

	}

}
