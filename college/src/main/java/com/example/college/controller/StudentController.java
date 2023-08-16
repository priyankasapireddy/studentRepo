package com.example.college.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.college.dto.Student;
import com.example.college.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping(value = "/all")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}

}
