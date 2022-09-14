package com.javaguides.StudentManagementSystem.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaguides.StudentManagementSystem.entity.Student;
import com.javaguides.StudentManagementSystem.repository.StudentRepository;
import com.javaguides.StudentManagementSystem.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void DeleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
