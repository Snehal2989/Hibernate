package com.BankProject_HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;



public class Imp_Method implements Bank_methods{

	Scanner sc= new Scanner(System.in);
	@Override
	
	public void Addaccount() {
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		
    
   System.out.println("Enter the number of account u have to enter");
   int size=sc.nextInt();
   
   for(int i=1;i<=size;i++)
   {
	   Transaction tx = session.beginTransaction();
	   Account act=new Account();
	   System.out.println("Account no is :  " +i);
	   System.out.println("Enter the account number");
	   act.setAct_num(sc.nextInt());
	   System.out.println("Enter the account holder name");
	   act.setAct_holder_name(sc.next());
	   System.out.println("Enter the Balance");
	   double bal=sc.nextDouble();
	   act.setAct_bal(bal);
	   System.out.println("Enter the adhar card number");
	   act.setAdhar(sc.nextLong());
	   session.save(act);
	   tx.commit();
   }
  
   
  
	}

	@Override
	public void ViewAccount() {
		
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Account act=new Account();
		
		System.out.println("Enter the account number which data ,u have to see ");
		int x= sc.nextInt();
		String query="From Account where act_num=?";
		Query q1 = session.createQuery(query);
		q1.setParameter(0, x);
		List<Account> list = q1.getResultList();
		for(Account det:list)
		{
			System.out.println(det.getAct_num()+" "+ det.getAct_holder_name() +" "+det.getAct_bal() +" "+ det.getAdhar());
		}
	//	q1.executeUpdate();
	
		tx.commit();
	}

	@Override
	public void WithdrawnMoney() {
StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Account act=new Account();
		
		System.out.println("Enter the account number");
		int x=sc.nextInt();
		String s1="from Account where act_num=:id";
		Query q1 = session.createQuery(s1);
		q1.setParameter("id",x);
		List <Account> actlist = q1.getResultList();
		for(Account det:actlist)
		{
			double bal=det.getAct_bal();
			System.out.println("Enter the amount u have to withdrawn");
			double amt=sc.nextDouble();
			double balance=bal-amt;
			act.setAct_bal(balance);
			System.out.println("New balance is "+act.getAct_bal());
			String s11="Update Account set act_bal =? where act_num=?";
			Query q12 = session.createQuery(s11);
			q12.setParameter(0,balance);
			q12.setParameter(1,x);
			q12.executeUpdate();
			session.save(s11);
			
		}
		tx.commit();
	}

	@Override
	public void DepositMoney() {
		
StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Account act=new Account();
		
		System.out.println("Enter the account number");
		int x=sc.nextInt();
		String s1="from Account where act_num=:id";
		Query q1 = session.createQuery(s1);
		q1.setParameter("id",x);
		List <Account> actlist = q1.getResultList();
		for(Account det:actlist)
		{
			double bal=det.getAct_bal();
			System.out.println("Enter the amount u have to deposit");
			double amt=sc.nextDouble();
			double balance=bal+amt;
			act.setAct_bal(balance);
			System.out.println("New balance is "+act.getAct_bal());
			String s11="Update Account set act_bal =? where act_num=?";
			Query q12 = session.createQuery(s11);
			q12.setParameter(0,balance);
			q12.setParameter(1,x);
			q12.executeUpdate();
			session.save(s11);
			
		}
		tx.commit();
	}

	@Override
	public void Deletedata() {
		
		
	}

	@Override
	public void Updateaccount() {
StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds= new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		Account act=new Account();
		
		System.out.println("Enter the account number");
		int x=sc.nextInt();
		String q1="Update Account set act_bal=? where act_num=?";
		Query query1 = session.createQuery(q1);
		query1.setParameter(0,25000d);
		query1.setParameter(1,x);
		
		query1.executeUpdate();
		tx.commit();
		
	}
     
	

}
