package com.javaguides.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.StudentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
