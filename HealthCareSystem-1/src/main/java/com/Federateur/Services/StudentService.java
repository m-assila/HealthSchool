package com.Federateur.Services;

import java.util.List;
import java.util.Optional;

import com.Federateur.Beans.Student;
import com.Federateur.Beans.UserDTO;

public interface StudentService {
	
	void saveStudent(Student t);
	String logStudent(UserDTO t);
	public void deleteStudentById(Long id);
	Optional<Student> getStudentById(Long id);
	List<Student> getAllStudents();

}
