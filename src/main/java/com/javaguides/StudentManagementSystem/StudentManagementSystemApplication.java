package com.javaguides.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.StudentManagementSystem.entity.Student;
import com.javaguides.StudentManagementSystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Deepak","Tiwari","deepaktiwari8226@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2 = new Student("Manish","Kumar","ManishKumar123@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student("Bhagi","Lodhi","BhagiLoadhi644@gmail.com");
//		studentRepository.save(s3);
		
	}

}
