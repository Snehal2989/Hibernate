package com.weborestone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int pro_id;
	private String pro_name;
	private Double pro_price;
	private String pro_remark;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public Double getPro_price() {
		return pro_price;
	}
	public void setPro_price(Double pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_remark() {
		return pro_remark;
	}
	public void setPro_remark(String pro_remark) {
		this.pro_remark = pro_remark;
	}
	

}
