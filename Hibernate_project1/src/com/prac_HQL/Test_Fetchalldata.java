package com.prac_HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Utility.Utility;

public class Test_Fetchalldata {

	public static void main(String[] args) {
		Session ss = Utility.getSession();
		
		String s1="From Book";
		Query q1 = ss.createQuery(s1);
       List<Book> rs = q1.getResultList();
       for(Book details:rs)
       {
    	   System.out.println(details.getBk_id() + " "+ details.getBk_name() +" " + details.getBk_author() );
       }
	}

}
