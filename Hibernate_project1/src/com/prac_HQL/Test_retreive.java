package com.prac_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Utility.Utility;

public class Test_retreive {

	public static void main(String[] args) {
		Session ss = Utility.getSession();
		
		String s1="From Book where bk_id=?";
		Query que = ss.createQuery(s1);
		que.setParameter(0,5555);
		Book result = (Book)que.getSingleResult();
		System.out.println(result.getBk_id()+" "+result.getBk_name()+" "+result.getBk_author());
		
		
		
//		List<Book> rs = que.getResultList();
//		for(Book info:rs)
//		{
//			System.out.println(info.getBk_id() + " " + info.getBk_name() + " " + info.getBk_author() );
//		}
          que.executeUpdate();
          ss.beginTransaction().commit();
	}

}
