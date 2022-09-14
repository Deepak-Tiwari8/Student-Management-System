package com.javaguides.StudentManagementSystem.service;

import java.util.List;

import com.javaguides.StudentManagementSystem.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void DeleteStudentById(Long id);
}
