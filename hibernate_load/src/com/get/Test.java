package com.get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {

    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    
    MetadataSources mds=new MetadataSources(registry);
    
    Metadata md=mds.getMetadataBuilder().build();
    
    SessionFactory sf=md.getSessionFactoryBuilder().build();
    
    Session s= sf.openSession();
    
//    Employee e= new Employee();
//    e.setEmpid(150);
//    e.setEmpname("Mr.Mathur");
//    e.setEmpdesig("Manager");
//    
   // s.save(e);
    //s.beginTransaction().commit();
    
    Employee emp=s.load(Employee.class,150);  //here if u r giving other than insert value then it gives only duplicate id ,and
    System.out.println(emp.getEmpid());    //  for other field it gives objectnot found exception.
    		System.out.println(emp.getEmpname());
    System.out.println(emp.getEmpdesig());

	}

}
