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

import com.Federateur.Beans.Medication;
import com.Federateur.Services.MedicationService;


@RestController

@RequestMapping("/api/v1/medics")
public class MedicationController {
	
	@Autowired
	MedicationService medicationService;
	
	@GetMapping
	List<Medication> getMedications(){
		return medicationService.getAllMedications();
	}
	
	
	@PostMapping
	public void saveMedication(@RequestBody Medication m) {
		medicationService.saveMedication(m);
	}
	
	@GetMapping("/{id}")
	public Optional<Medication> get(@PathVariable("id") long id) {
		return medicationService.getMedicationById(id);
	}
	

}
