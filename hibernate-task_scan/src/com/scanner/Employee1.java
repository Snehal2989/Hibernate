package com.scanner;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee1 {

	@Id
	private int emp_id;
	private String emp_name;
	private long emp_mb;
	private double emp_sal;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public long getEmp_mb() {
		return emp_mb;
	}
	public void setEmp_mb(long emp_mb) {
		this.emp_mb = emp_mb;
	}
	public double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	} 
	
	
	}
