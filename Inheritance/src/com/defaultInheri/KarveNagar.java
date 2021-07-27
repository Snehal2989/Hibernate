package com.defaultInheri;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KarveNagar extends CJC {
	
	@Id
	private String addr;
	private int total;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
