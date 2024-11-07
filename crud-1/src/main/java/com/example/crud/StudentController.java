package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")

public class StudentController{
	
	private final StudentRepository studentRepository;
	
	@Autowired 
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	@GetMapping
	public List<student> getAllstudent(){
		return studentRepository.findAll();
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}