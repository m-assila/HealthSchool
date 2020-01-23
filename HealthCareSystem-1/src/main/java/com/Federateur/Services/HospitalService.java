package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import com.Federateur.Beans.Hospital;

public interface HospitalService {
	
	void saveHospital(Hospital m);
	public void deleteHospitalById(Long id);
	Optional<Hospital> getHospitalById(Long id);
	List<Hospital> getAllHospitals();

}
