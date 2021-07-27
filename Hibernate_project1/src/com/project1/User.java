package com.project1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_info")
public class User {
	
	@Id
	private int useerid;
	private String user_name;
	private String user_add;
	private double user_salary;
	public int getUseerid() {
		return useerid;
	}
	public void setUseerid(int useerid) {
		this.useerid = useerid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_add() {
		return user_add;
	}
	public void setUser_add(String user_add) {
		this.user_add = user_add;
	}
	public double getUser_salary() {
		return user_salary;
	}
	public void setUser_salary(double user_salary) {
		this.user_salary = user_salary;
	}
	
	
	

}
