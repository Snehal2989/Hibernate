package com.joined;

import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class KarveNagar extends CJC {
	
	
	private int Strength;

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}
	

}
