package com.prac_HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bk_id;
	public int getBk_id() {
		return bk_id;
	}
	public void setBk_id(int bk_id) {
		this.bk_id = bk_id;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getBk_author() {
		return bk_author;
	}
	public void setBk_author(String bk_author) {
		this.bk_author = bk_author;
	}
	private String bk_name;
	private String bk_author;

}
