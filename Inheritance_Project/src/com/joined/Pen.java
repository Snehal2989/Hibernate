package com.joined;

import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class Pen extends Product {
	

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
