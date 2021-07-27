package First_level_cache;

import org.hibernate.Session;

import Util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		Session ss = HibernateUtil.getSession().openSession();
		
		Student s = ss.load(Student.class,11);
		System.out.println(s.getSid());
		System.out.println(s.getName());
		System.out.println(s.getAddr());

		Student s1 = ss.load(Student.class,11);
		System.out.println(s1.getSid());
		System.out.println(s1.getName());  // its not fatching query bz ,retreiving data by same session
		System.out.println(s1.getAddr());

		
		
		Session ss1 = HibernateUtil.getSession().openSession();
		Student st = ss1.load(Student.class,12);
		System.out.println(st.getSid());
		System.out.println(st.getName());
		System.out.println(st.getAddr());// it fetches the query bz of new Sesion object
		
		Student st1 = ss1.load(Student.class,11);
		System.out.println(st1.getSid());
		System.out.println(st1.getName());//// its not fatching query bz ,retreiving data by same session
		System.out.println(st1.getAddr());
	}

}
