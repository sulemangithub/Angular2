package com.kpit.sample.services;

import java.util.List;

import com.kpit.sample.pojos.Student;

public interface StudentService {
	
	public void saveStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public void removeStudent(int id);
	public Student getByEmail( String email);
	public List<Student> getStudentsLike(String name);
}
