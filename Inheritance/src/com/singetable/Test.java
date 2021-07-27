package com.singetable;

import org.hibernate.Session;

import com.Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		
		Session s = HibernateUtil.getSession().openSession();
		KarveNagar kn=new KarveNagar();
		kn.setCid(105);
		kn.setCname("C++");
		kn.setMsg("Regular");
		
		Akurdi a= new Akurdi();
		a.setCid(108);
		a.setCname(".NET");
		a.setMsg("Weekend");
		
		s.save(kn);
		s.save(a);
		s.beginTransaction().commit();
		
		
		

	}

}
