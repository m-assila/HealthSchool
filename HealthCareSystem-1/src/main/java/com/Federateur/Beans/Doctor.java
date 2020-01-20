package com.Federateur.Beans;


import javax.persistence.Entity;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Doctor extends Person{
	public Doctor() {
		
	}
	int YearsOfExperience;
	int Domain;
	

}
