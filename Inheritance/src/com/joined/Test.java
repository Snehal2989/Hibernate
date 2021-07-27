package com.joined;

import org.hibernate.Session;

import com.Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSession().openSession();
		
		KarveNagar kn= new KarveNagar();
		kn.setCid(110);
		kn.setCname("PHP");
		kn.setStrength(100);
		
		Akurdi a= new Akurdi();
		a.setCid(115);
		a.setCname("oracle");
		a.setAddr(" railwayst Akurdi");
		a.setStrength(60);
		
		
		s.save(a);
		s.save(kn);
		s.beginTransaction().commit();
	}

}
