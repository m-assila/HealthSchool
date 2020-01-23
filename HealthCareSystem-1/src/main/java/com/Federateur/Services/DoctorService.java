package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.UserDTO;



public interface DoctorService {
	
	void saveDoctor(Doctor t);
	String logDoctor(UserDTO t);
	public void deleteDoctorById(Long id);
	Optional<Doctor> getDoctorById(Long id);
	List<Doctor> getAllDoctors();

}
