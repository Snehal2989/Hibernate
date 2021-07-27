package com.defaultfor2;

import javax.persistence.Entity;

@Entity
public class Regular_Employee extends Employee{
	
	private float sal;
	private int bonus;
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
