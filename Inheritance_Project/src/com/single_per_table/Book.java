package com.single_per_table;

import javax.persistence.Entity;

@Entity
public class Book extends Product{

	
	private int bid;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	
}
