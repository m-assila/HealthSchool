package com.Federateur.Beans;



import javax.persistence.Entity;



import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends Person {
	public Student() {
		
	}
	
	String StudyLevel;
	String Major;

}
