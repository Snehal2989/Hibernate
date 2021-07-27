package com.program;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;

import HibernateUtil.HibernateUtil;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String desg;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + "]";
	}
	
//	public static void main(String[] args) {
//		Session ss = HibernateUtil.getSession().openSession();
//		
//		Employee e= new Employee();
//		e.setEid(102);
//		e.setEname("Raj");
//		e.setDesg("Developer");
//		
//		ss.save(e);
//		ss.beginTransaction().commit();
	}


