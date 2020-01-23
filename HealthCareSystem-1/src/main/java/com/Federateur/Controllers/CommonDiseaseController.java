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

import com.Federateur.Beans.CommonDisease;
import com.Federateur.Services.CommonDiseaseService;


@RestController

@RequestMapping("/api/v1/cmndis")
public class CommonDiseaseController {

	@Autowired
	CommonDiseaseService commonDiseaseService;
	
	@GetMapping
	List<CommonDisease> getCommonDiseases(){
		return commonDiseaseService.getAllCommonDiseases();
	}
	
	
	@PostMapping
	public void saveCommonDisease(@RequestBody CommonDisease m) {
		commonDiseaseService.saveCommonDisease(m);
	}
	
	@GetMapping("/{id}")
	public Optional<CommonDisease> get(@PathVariable("id") long id) {
		return commonDiseaseService.getCommonDiseaseById(id);
	}
	
	
}
