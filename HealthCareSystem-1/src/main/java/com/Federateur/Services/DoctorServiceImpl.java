package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.UserDTO;
import com.Federateur.Repositories.DoctorRepository;


import lombok.Getter;
import lombok.Setter;
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	@Getter
	@Setter
	private DoctorRepository repository;
	
	
	
	@Override
	public void saveDoctor(Doctor doc) {
		Doctor d=repository.findDoctorByEmail(doc.getEmail());
		if(d==null) {
			 repository.save(doc);
		}
		else {
			System.out.println("The doctor already exists");
		}
		
	}
	@Override
	public Boolean logDoctor(UserDTO t) {
		Doctor d=repository.findDoctorByEmail(t.getEmail());
		if(d==null) {
			 System.out.println("This account email doesn't exists !!");
			 return false;
		}
		if(d.getPassword().equals(t.getPassword())) {
			System.out.println("Credentials are correct , you are logged in !!");
			return true;
		}
		else {
			System.out.println("Your password isn't correct !! ");
			return false;
		}
	}

	@Override
	public void deleteDoctorById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Optional<Doctor> getDoctorById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return repository.findAll();
	}

	

}
