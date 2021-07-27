package com.defaultfor2;

import javax.persistence.Entity;

@Entity
public class Contract_employee extends Employee{

	
	private Float pay;
	public Float getPay() {
		return pay;
	}
	public void setPay(Float pay) {
		this.pay = pay;
	}
	public String getCont_dur() {
		return cont_dur;
	}
	public void setCont_dur(String cont_dur) {
		this.cont_dur = cont_dur;
	}
	private String cont_dur;
}
