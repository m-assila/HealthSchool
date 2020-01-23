package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import com.Federateur.Beans.Medication;


public interface MedicationService {
	
	void saveMedication(Medication m);
	public void deleteMedicationById(Long id);
	Optional<Medication> getMedicationById(Long id);
	List<Medication> getAllMedications();

}
