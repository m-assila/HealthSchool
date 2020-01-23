package com.Federateur.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Federateur.Beans.Hospital;
import com.Federateur.Services.HospitalService;


@RestController

@RequestMapping("/api/v1/hospitals")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@GetMapping
	List<Hospital> getHospitals(){
		return hospitalService.getAllHospitals();
	}
	
	
	@PostMapping
	public void saveMedication(@RequestBody Hospital h) {
		hospitalService.saveHospital(h);
	}
	
	@GetMapping("/{id}")
	public Optional<Hospital> get(@PathVariable("id") long id) {
		return hospitalService.getHospitalById(id);
	}

}
