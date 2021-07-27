package com.defaultInheri;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CJC {
	
	private int cid;
	private String cname;
	
	
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
	
	

}
