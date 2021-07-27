package com.defaultinheri;

import org.hibernate.Session;

import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
	Session s = HibernateUtil.getSession().openSession();
	
	Book bk= new Book();
	bk.setPid(12345678);
	bk.setPname("Tv Unit");
	bk.setAuthor("asdf");
	
	Pen p= new Pen();
	p.setPid(987456322);
	p.setPname("Mobile");
	p.setColor("Silver");
	
	s.save(bk);
	s.save(p);
	s.beginTransaction().commit();

	}

}
