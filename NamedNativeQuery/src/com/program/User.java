package com.program;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity

@NamedNativeQuery(name="data_all",query="select * from  User_det",resultClass = User.class)
@Table(name="User_det")
public class User {
	
	@Id
	private int uid;
	private String uname;
	private String udesg;
	private String usalary;
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
	public String getUdesg() {
		return udesg;
	}
	public void setUdesg(String udesg) {
		this.udesg = udesg;
	}
	public String getUsalary() {
		return usalary;
	}
	public void setUsalary(String usalary) {
		this.usalary = usalary;
	}
	@Override
	public String toString() {
		return "User \nuid=" + uid + ", uname=" + uname + ", udesg=" + udesg + ", usalary=" + usalary ;
	}
	
	

}
