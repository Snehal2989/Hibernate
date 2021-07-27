package com.single_per_table;

import org.hibernate.Session;

import com.util.HibernateUtil;

public class Table {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		Book bk= new Book();
		bk.setPid(454564654);
		bk.setPname("Books");
		bk.setBid(1441);
		
		Pen p= new Pen();
		p.setPid(564654);//v cant give same ,it will give exception org.hibernate.NonUniqueObjectException
		p.setColor("Red");
		
		s.save(p);
		s.save(bk);
		s.beginTransaction().commit();
		
		

	}

}
