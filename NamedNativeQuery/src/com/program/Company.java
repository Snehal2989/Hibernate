package com.program;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@NamedNativeQueries({
	@NamedNativeQuery(name="Single_data",query="Select * from Company where cid=:cd",resultClass = Company.class),
	@NamedNativeQuery(name="Update_data",query="Update Company set Cname=:cn where cid=:cd",resultClass = Company.class),
	//@NamedNativeQuery(name="Delete_data",query="delete from Company where cid=122",resultClass = Company.class)
})
public class Company {

	
	@Id
	private int cid;
	@Override
	public String toString() {
		return "Company \ncid=" + cid + "\ncname=" + cname + "\nlocation=" + location ;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String cname;
	private String location;
	
}
