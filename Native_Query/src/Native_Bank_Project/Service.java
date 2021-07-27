package Native_Bank_Project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

//import HibernateUtil.HibernateUtil;

public class Service implements Bank_Methods{

	Scanner sc= new Scanner(System.in);
	@Override
	public void Addaccount() {
		Session s = HibernateUtil.getSession().openSession();
		Account a= new Account();
		Transaction tx = s.beginTransaction();
		System.out.println("Enter the total account have to enter");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter the account num");
		int x=sc.nextInt();
		System.out.println("Enter the account holder name");
		String name=sc.next();
        System.out.println("Enter the balance");
        double balance=sc.nextDouble();
        System.out.println("Enter the adhar num");
       long num=sc.nextLong();
		
        NativeQuery<Account> query = s.createNativeQuery("Insert into Account(act_num,act_holder_name,act_bal,adhar) values(:act_id,:act_name,:bala,:adh)",Account.class);
		   
        query.setParameter("act_id",x);
        query.setParameter("act_name",name);
        query.setParameter("bala", balance);
        query.setParameter("adh",num);
        
        query.executeUpdate();
		  tx.commit();
		  System.out.println("Data inserted");
		}
        
//		NativeQuery<Account> query = s.createNativeQuery("insert into Account( act_num,act_holder_name,act_bal,adhar ) values(:ac_num,:name,:bal_act,:adh)",Account.class);
//	     
//		  query.setParameter("ac_num",10102020);
//		  query.setParameter("name","Mr.Patil");
//		  query.setParameter("bal_act",50000);
//		  query.setParameter("adh",4545445);
	
	}

	@Override
	public void ViewAccount() {
		Session s = HibernateUtil.getSession().openSession();
		System.out.println("Enter the account num");
		int x=sc.nextInt();
		
		NativeQuery<Account> query =s.createNativeQuery("Select * from Account where act_num=:act_id",Account.class);
		query.setParameter("act_id",x);
		List<Account> act=query.getResultList();
		
		for(Account a:act)
		{
			if(a.getAct_num()==x)
			{
				System.out.println(a);
			}
		}
		
//		NativeQuery<Account>query=s.createNativeQuery("select * from Account where act_num=:act_id",Account.class);
//		    query.setParameter("act_id", x);
//
//            Account act=query.getSingleResult();
//            System.out.println(act);
		   
	}

	@Override
	public void WithdrawnMoney() {
		Session s=HibernateUtil.getSession().openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter the account num");
		int x= sc.nextInt();
		NativeQuery<Account> query=s.createNativeQuery("Select * from Account where act_num=:act_id",Account.class);
		query.setParameter("act_id",x);
		List<Account>act=query.getResultList();
		for(Account a:act)
		{
			double amt=a.getAct_bal();
			System.out.println("Current balance is "+amt);
			System.out.println("Enter the maney u have to withdraw");
			double money=sc.nextDouble();
			double bal=amt-money;
			a.setAct_bal(bal);
		}
		
		tx.commit();
	}

	@Override
	public void DepositMoney() {
		Session s=HibernateUtil.getSession().openSession();
		System.out.println("Enter the account num");
		int x= sc.nextInt();
		Transaction tx=s.beginTransaction();
		NativeQuery<Account> query=s.createNativeQuery("select * from Account where act_num=:act_id", Account.class);
	    query.setParameter("act_id", x);
	    List<Account> act=query.getResultList();
	    for(Account a:act)
	    {
	    	if(a.getAct_num()==x)
	    	{
	    	    double amt=a.getAct_bal();
	    	    System.out.println("Current balance is "+amt);
	    	    System.out.println("Enter the amount .do u have to deposit");
	    	    double money=sc.nextDouble();
	    	    double bal=amt+money;
	    	    a.setAct_bal(bal);
	    	}
	    }
	   tx.commit();
	}

	@Override
	public void Updateaccount() {
		Session s=HibernateUtil.getSession().openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter the account num");
		int x= sc.nextInt();
		NativeQuery<Account> query=s.createNativeQuery("Update Account set act_holder_name=:name where act_num=:act_id",Account.class);
		query.setParameter("name","RajLaxmi");
		query.setParameter("act_id",x);
		
		query.executeUpdate();
		tx.commit();
	}

	@Override
	public void Deleteaccount() {
		Session s=HibernateUtil.getSession().openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter the account num");
		int x= sc.nextInt();
		NativeQuery<Account> query=s.createNativeQuery("Delete from Account where act_num=:act_id",Account.class);
		query.setParameter("act_id",x);
		query.executeUpdate();
		tx.commit();
	}

}
