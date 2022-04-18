package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etudiant {
	@Id
	private String id;
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
