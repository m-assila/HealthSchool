package com.Federateur.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.UserDTO;
import com.Federateur.Services.DoctorService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/register/doc")
	public void createDoct(@RequestBody Doctor d) {
		doctorService.saveDoctor(d);	
	}
	
	@PostMapping("/login/doc")
	Boolean DoctorIsHere(@RequestBody UserDTO d) {
		return doctorService.logDoctor(d);
	}
	
	@GetMapping
	List<Doctor> getDoctors(){
		return doctorService.getAllDoctors();
	}
	

}
