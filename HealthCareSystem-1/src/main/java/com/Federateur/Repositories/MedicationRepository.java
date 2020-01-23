package com.Federateur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Federateur.Beans.Medication;

@Repository
public interface MedicationRepository  extends JpaRepository<Medication, Long> {
	
	

}
