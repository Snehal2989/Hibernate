package com.Program;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
//@Cacheable
@NamedQueries({
	@NamedQuery(name="Data_fetch",query="From User u"),
	@NamedQuery(name="Single_record",query="From User where uid=:ud"),
	@NamedQuery(name="Update_name",query="Update User set uname=:un where uid=:ud")
})

public class User {

	
	@Id
	private int uid;
	private String uname;
	private int salary;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User_details are: \nuid=" + uid + "\n uname=" + uname + "\n salary=" + salary ;
	}
	
}
