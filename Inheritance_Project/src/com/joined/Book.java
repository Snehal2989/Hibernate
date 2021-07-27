package com.joined;

import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class Book extends Product{
	
	
	
	private int bid;
	private String author;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
