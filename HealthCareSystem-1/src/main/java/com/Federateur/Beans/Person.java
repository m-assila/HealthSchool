package com.Federateur.Beans;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
public class Person {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	String password;
	LocalDate dateOfBirth;
	String city;
	String email;
	
	
	public Person() {
	
	}
}
