package com.kpit.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.sample.pojos.Student;
import com.kpit.sample.services.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService service;
	
	@GetMapping("/kpit/student/api/getAllStudents")
	public List<Student> m1()
	{
		return service.getAllStudents();
	}
	
	@PostMapping("/kpit/student/api/addStudent")
	public String m2(@RequestBody Student student)
	{
		service.saveStudent(student);
		return "{staus:ok}";
	}
	
	@GetMapping("/kpit/student/api/getStudent/{id}")
	public Student m3(@PathVariable("id") int id)
	{
		return service.getStudent(id);
	}
	
	@DeleteMapping("/kpit/student/api/deleteStudent/{id}")
	public String m4(@PathVariable("id") int id)
	{
		service.removeStudent(id);
		return "{staus:ok}";
	}	
	
	@GetMapping("/kpit/student/api/getStudentByEmail/{email}")
	public Student m5(@PathVariable("email") String email)
	{
		return service.getByEmail(email);
	}
	
	@GetMapping("/kpit/student/api/getStudentsLike/{name}")
	public List<Student> m6(@PathVariable("name") String name)
	{
		return service.getStudentsLike(name.concat("%"));
	}
	
	
}
