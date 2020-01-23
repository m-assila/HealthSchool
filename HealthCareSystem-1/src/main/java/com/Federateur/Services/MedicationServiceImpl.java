package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Federateur.Beans.Medication;
import com.Federateur.Repositories.MedicationRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class MedicationServiceImpl implements MedicationService {

	@Autowired
	@Getter
	@Setter
	private MedicationRepository repository;
	
	
	
	
	@Override
	public void saveMedication(Medication m) {
		repository.save(m);

	}

	@Override
	public void deleteMedicationById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Optional<Medication> getMedicationById(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Medication> getAllMedications() {
		
		return repository.findAll();
	}

}
