package CURD_operation;

import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Scanner;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import Hibernate.Util.HibernateUtil;

public class Impl_Method implements Method {

	
	Scanner sc= new Scanner(System.in);
	@Override
	public void insertData() {
		Employee e= new Employee();
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		 NativeQuery query = s.getNamedNativeQuery("Insert_data");///...
		  query.setParameter(0,113);
		  query.setParameter(1,"Durga");
		  query.setParameter(2,"Dr");
		  query.setParameter(3,15000.00);
		  
		  query.executeUpdate();
		
	
		tx.commit();
	}

	@Override
	public void retreiveall() {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		List<Employee> list = s.getNamedNativeQuery("All_data").getResultList();
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		
	}

	@Override
	public void retreivesingledata() {
		Session s = HibernateUtil.getSession().openSession();
		
		Employee result = (Employee) s.getNamedNativeQuery("Retreive_single").setParameter("ed",111).getSingleResult();
		System.out.println(result);
		
	}

	@Override
	public void updatedata() {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		NativeQuery query = s.getNamedNativeQuery("Update_data");
		query.setParameter("sal",30000.00);
		   query.setParameter("ed",111);
	        query.executeUpdate();
	        tx.commit();
	}

	@Override
	public void deletedata() {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();
		   NativeQuery<Employee> parameter = s.getNamedNativeQuery("delete_data").setParameter("ed",112);
	          parameter.executeUpdate();
	          tx.commit();
	}

	@Override
	public void ins_data() {
		Session s = HibernateUtil.getSession().openSession();
		Transaction tx = s.beginTransaction();                      
	    NativeQuery query = s.getNamedNativeQuery("Ins_data");
	   	         
		query.setParameter("ed", 115);
		query.setParameter("en", "Yuraj");
		query.setParameter("edsg", "Manager");
		query.setParameter("esal", 50000.00);

	    query.executeUpdate();
	      tx.commit();
	   
	
	}
}
