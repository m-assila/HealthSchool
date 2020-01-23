package com.Federateur.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.UserDTO;
import com.Federateur.Services.DoctorService;

@RestController

@RequestMapping("/api/v1/auth/doc")
public class AuthDocController {
	
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/register")
	public void createDoct(@RequestBody Doctor d) {
		doctorService.saveDoctor(d);	
	}
	
	@PostMapping("/login")
	String DoctorIsHere(@RequestBody UserDTO d) {
		return doctorService.logDoctor(d);
	}
	
	@GetMapping
	List<Doctor> getDoctors(){
		return doctorService.getAllDoctors();
	}
	

}
