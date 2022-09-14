package com.javaguides.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaguides.StudentManagementSystem.entity.Student;
import com.javaguides.StudentManagementSystem.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model)
	{
		model.addAttribute("students",studentService.getAllStudent());
		return "student";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_Student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id ,Model model)
	{
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_Student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id ,@ModelAttribute("student")Student student ,Model model)
	{
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String DeleteStudent(@PathVariable Long id)
	{
		studentService.DeleteStudentById(id);	
		return "redirect:/students";
	}
}

