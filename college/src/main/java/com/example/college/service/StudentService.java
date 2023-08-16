package com.example.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.college.dto.Student;
import com.example.college.repository.StudentRepository;
import reactor.core.publisher.Flux;

@Service
public class StudentService {

	@Autowired
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;

	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {

		List<Student> studentList = studentRepository.findAll();

		return studentList;
	}

}
