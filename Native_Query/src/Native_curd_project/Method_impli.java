package Native_curd_project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import HibernateUtil.HibernateUtil;

public class Method_impli implements Lib_Methods {
	Scanner sc = new Scanner(System.in);

	@Override
	public void insertbook() {
		Libraray l=new Libraray();
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		NativeQuery<Libraray> query = s.createNativeQuery("insert into Libraray(lid,lname,laddrs,totalbk)  values(:l_id,:l_name,:l_add,:total)",Libraray.class);

		query.setParameter("l_id",12345);
		query.setParameter("l_name","Rajaram");
		query.setParameter("l_add","Ngp");
		query.setParameter("total",2250);
		
		query.executeUpdate();
		tx.commit();
	}

	@Override
	public void viewallbook() {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		  NativeQuery<Libraray> query = s.createNativeQuery("Select * from Libraray where lid=:L_id",Libraray.class);
	
	     query.setParameter("L_id",12345);
	     Libraray lib_info = query.getSingleResult();
	    System.out.println(lib_info);
	     tx.commit();
	}

	@Override
	public void updatebook() {
		Session ss = HibernateUtil.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		NativeQuery<Libraray> query = ss.createNativeQuery("update Libraray set lname=:L_name,laddrs=:L_add,totalbk=:total where lid=:L_id",Libraray.class);
        query.setParameter("L_id",45678);
        
        query.setParameter("L_name","Tilak");
        query.setParameter("L_add","Warje");
        query.setParameter("total", 4100);
        query.executeUpdate();
        tx.commit();
	}

	@Override
	public void deletebook() {
		Session ss = HibernateUtil.getSession().openSession();
		Transaction tx = ss.beginTransaction();
		
		NativeQuery<Libraray> query = ss.createNativeQuery("Delete from Libraray where lid=:L_id",Libraray.class);
         query.setParameter("L_id",14785);
         query.executeUpdate();
         tx.commit();
	}

}
