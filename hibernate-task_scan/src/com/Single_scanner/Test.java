package com.Single_scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		SessionFactory ssf = Hibernate_ulit.getsession();
		
		Employee e= new Employee();
		e.setEmp_id(255);//here w r passing 2times values for id 155,its not show duplicate error
		             // bz , w r using saveorUpdate method thatsy it update the previous value.
		e.setEmp_name("Joshi");
		e.setEmp_designation("Manager");
		e.setEmp_sal(55000);
		
		//s.save(e); s cannot be resolved gives error bz session is not open .
		
		Session s=ssf.openSession();
		
		//now retreving the data
		Employee emp = s.get(Employee.class,111);
		{
			System.out.println("Employee id is :" +emp.getEmp_id() + "Employee Name is :" +emp.getEmp_name()
			                    +" Employee designation is : "+emp.getEmp_designation() 
			                    + " Employee salary is : "+emp.getEmp_sal()
			                    +" class is :" +emp.getClass());
		}
		
		s.saveOrUpdate(e);
		s.beginTransaction().commit();
		// above both query r exexcuting simultaneously,first it fetch the data then insert the data.

	}

}
