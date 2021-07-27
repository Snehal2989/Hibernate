package com.singetable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akurdi extends CJC{
	
	//@Id
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
