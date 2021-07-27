package com.defaultInheri;

import org.hibernate.Session;

import com.Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession().openSession();
		//CJC c= new CJC();
		KarveNagar kn= new KarveNagar();
		kn.setCid(111);
		kn.setCname("Java");
		kn.setAddr("Pune");
		kn.setTotal(100);

		Akurdi a= new Akurdi();
		a.setCid(112);
		a.setCname("PHP");
		a.setBatch("Weekend");
		
		s.save(a);
		s.save(kn);
		//s.save(c); if v save parent class its gives exception :org.hibernate.MappingException:,so in default inheritance no need to 
		               // save parent class
		s.beginTransaction().commit();
	}

}
