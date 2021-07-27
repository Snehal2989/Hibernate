package First_level_cache;

import org.hibernate.Session;

import Util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session ss = HibernateUtil.getSession().openSession();
		
		Student st=new Student();
		st.setSid(11);
		st.setName("Rina");
		st.setAddr("Pune");
		
		Student st1=new Student();
		st1.setSid(12);
		st1.setName("Omkar");
		st1.setAddr("Amravti");
		
		ss.save(st);
		ss.save(st1);
		ss.beginTransaction().commit();

		
	}

}
