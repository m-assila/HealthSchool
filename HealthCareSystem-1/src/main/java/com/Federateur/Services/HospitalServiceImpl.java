package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.Hospital;
import com.Federateur.Repositories.DoctorRepository;
import com.Federateur.Repositories.HospitalRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	@Getter
	@Setter
	private HospitalRepository repository;
	
	
	
	@Override
	public void saveHospital(Hospital m) {
		
		Hospital d=repository.findHospitalByName(m.getName());
		if(d==null) {
			 repository.save(m);
		}
		else {
			System.out.println("The hospital already exists");
		}

	}

	@Override
	public void deleteHospitalById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Hospital> getHospitalById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Hospital> getAllHospitals() {
		return repository.findAll();
	}

}
