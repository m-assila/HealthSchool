package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Federateur.Beans.CommonDisease;
import com.Federateur.Repositories.CommonDiseaseRepository;


import lombok.Getter;
import lombok.Setter;

@Service
public class CommonDiseaseServiceImpl implements CommonDiseaseService {

	@Autowired
	@Getter
	@Setter
	private CommonDiseaseRepository repository;
	
	
	
	@Override
	public void saveCommonDisease(CommonDisease m) {
		CommonDisease d=repository.findCommonDiseaseByName(m.getName());
		if(d==null) {
			 repository.save(m);
		}
		else {
			System.out.println("The CommonDisease already exists");
		}

	}

	@Override
	public void deleteCommonDiseaseById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Optional<CommonDisease> getCommonDiseaseById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<CommonDisease> getAllCommonDiseases() {
		return repository.findAll();
	}

}
