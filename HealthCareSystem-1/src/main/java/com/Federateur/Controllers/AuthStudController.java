package com.Federateur.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Federateur.Beans.Student;
import com.Federateur.Beans.UserDTO;
import com.Federateur.Services.StudentService;

@RestController

@RequestMapping("/api/v1/auth/stud")
public class AuthStudController {
	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/register")
	public void createStud(@RequestBody Student d) {
		studentService.saveStudent(d);	
	}
	
	@PostMapping("/login")
	String StudentIsHere(@RequestBody UserDTO d) {
		return studentService.logStudent(d);
	}
	
	@GetMapping
	List<Student> getStudents(){
		return studentService.getAllStudents();
	}

}
