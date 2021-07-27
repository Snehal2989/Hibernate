package com.table_per_class;

import javax.persistence.Entity;

@Entity
public class Akurdi extends CJC{
	
	
	private int strength;
	private String batch;
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	

}
