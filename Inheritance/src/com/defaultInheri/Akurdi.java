package com.defaultInheri;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akurdi extends CJC{
	
	@Id
	private String batch ;

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

}
