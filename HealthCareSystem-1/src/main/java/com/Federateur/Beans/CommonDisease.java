package com.Federateur.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommonDisease {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	public CommonDisease() {
		
	}
	
	String name;
	String description;
	String treatement;
	

}
