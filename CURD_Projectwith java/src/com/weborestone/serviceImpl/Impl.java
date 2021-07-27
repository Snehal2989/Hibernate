package com.weborestone.serviceImpl;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weborestone.hibernateUtil.Hibernate_Util;
import com.weborestone.model.Product;
import com.weborestone.service.Service;

public class Impl implements Service{
	Scanner sc= new Scanner(System.in);
	@Override
	public void insertdata() {
		Session s = Hibernate_Util.getSession().openSession();
		
		
		for(int i=1;i<=3;i++)
		{
			Product p= new Product();
			System.out.println("Sequence num:" +i);
		System.out.println("Enter the product id");
		int num=sc.nextInt();
		p.setPro_id(num);
		System.out.println("Enter the product name");
		String name=sc.next();
		p.setPro_name(name);
		System.out.println("Enter the price");
		double pr=sc.nextDouble();
		p.setPro_price(pr);
		System.out.println("Enter the remark");
		String r=sc.next();
		p.setPro_remark(r);
		
		s.saveOrUpdate(p);
		s.beginTransaction().commit();
	}
	}

	@Override
	public void updatedata() {
		
		Session s1 = Hibernate_Util.getSession().openSession();
		Transaction tx = s1.beginTransaction();
		System.out.println("Enter the product id");
		int x=sc.nextInt();
		System.out.println("Enter the product name");
		String name=sc.next();
		System.out.println("Enter the product remark");
		String rmk=sc.next();
		System.out.println("Enter the product price");
		double pr=sc.nextDouble();
		String Query="Update Product set pro_name=?,pro_remark=? ,pro_price=? where pro_id=?";
		Query q1 = s1.createQuery(Query);
		q1.setParameter(0,name);
		q1.setParameter(1,rmk);
		q1.setParameter(2,pr);
		q1.setParameter(3,x);
		q1.executeUpdate();
		
		tx.commit();
		
		
	}

	@Override
	public void retreivedata() {
		Session s1 = Hibernate_Util.getSession().openSession();
		System.out.println("Enter the product id");
		int x=sc.nextInt();
		String s11="From Product where pro_id=?";
		Query qu1 = s1.createQuery(s11);
		qu1.setParameter(0,x);
		List<Product> prod=qu1.getResultList();
		for(Product prod_det:prod)
		{
			System.out.println(prod_det.getPro_id());
			System.out.println(prod_det.getPro_name());
			System.out.println(prod_det.getPro_price());
			System.out.println(prod_det.getPro_remark());
		}
		
		s1.beginTransaction().commit();
	}

	@Override
	public void deletedata() {
		Session s1 = Hibernate_Util.getSession().openSession();
		Transaction tx = s1.beginTransaction();
		System.out.println("Enter the product id");
		int x=sc.nextInt();
		String s11="Delete from Product where pro_id=?";
		Query qu1 = s1.createQuery(s11);
		qu1.setParameter(0,x);
		qu1.executeUpdate();
		tx.commit();
	}

	@Override
	public void update() {
		Product p= new Product();
		Session ses = Hibernate_Util.getSession().openSession();
		System.out.println("Enter the product id");
		int num1=sc.nextInt();
		System.out.println("Enter the product name");
		String name1=sc.next();
		String que1="From Product where pro_id=?";
		Query q1 = ses.createQuery(que1);
		q1.setParameter(0,num1);
		Product prod = (Product)q1.getSingleResult();
		{
			System.out.println(prod.getPro_price());
		}
		
	}
		}


