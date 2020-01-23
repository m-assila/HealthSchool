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
public class Hospital {
	
	public Hospital() {
		
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	String name;
	String location;
	String phone;
	int distanceFromSchool;

}
