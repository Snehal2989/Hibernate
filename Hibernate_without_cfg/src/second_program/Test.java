package second_program;

import java.util.Scanner;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session s1 = Hibernate_Util.getSess().openSession();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			College c= new College();
			System.out.println("Enter the College Id");
			int num=sc.nextInt();
			c.setCol_id(num);
			System.out.println("Enter the college name");
			String name=sc.next();
			c.setCol_name(name);
           
			s1.saveOrUpdate(c);
			s1.beginTransaction().commit();
		}
		sc.close();

	}

}
