package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Federateur.Beans.Doctor;
import com.Federateur.Beans.Student;
import com.Federateur.Beans.UserDTO;
import com.Federateur.Repositories.DoctorRepository;
import com.Federateur.Repositories.StudentRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	@Getter
	@Setter
	private StudentRepository repository;
	
	
	
	@Override
	public void saveStudent(Student t) {
		Student d=repository.findStudentByEmail(t.getEmail());
		if(d==null) {
			 repository.save(t);
		}
		else {
			System.out.println("The doctor already exists");
		}

	}

	@Override
	public String logStudent(UserDTO t) {
		Student d=repository.findStudentByEmail(t.getEmail());
		if(d==null) {
			 System.out.println("This account email doesn't exists !!");
			 return "case1";
		}
		if(d.getPassword().equals(t.getPassword())) {
			System.out.println("Credentials are correct , you are logged in !!");
			return "case2";
		}
		else {
			System.out.println("Your password isn't correct !! ");
			return "case3";
		}
	}

	@Override
	public void deleteStudentById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

}
