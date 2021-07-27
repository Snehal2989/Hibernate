package com.joined;

import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class Akurdi  extends CJC{

	
	
	private int strength;
	private String addr;
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
