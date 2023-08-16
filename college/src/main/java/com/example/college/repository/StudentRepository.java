package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.college.dto.Student;
import com.example.college.entity.StudentEntity;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
	
	

}
