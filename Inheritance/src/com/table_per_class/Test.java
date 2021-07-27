package com.table_per_class;

import org.hibernate.Session;

import com.Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		
		KarveNagar kn= new KarveNagar();
		kn.setCid(11);
		kn.setCname("Oracle");
		kn.setBatch("Feb");
		kn.setStrength(150);
		
		Akurdi a= new Akurdi();
		a.setCid(15);
		a.setCname("HTML");
		a.setBatch("April");
		a.setStrength(40);
		
		s.save(a);
		s.save(kn);
		s.beginTransaction().commit();

	}

}
