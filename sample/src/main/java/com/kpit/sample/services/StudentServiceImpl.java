package com.kpit.sample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.kpit.sample.daos.StudentDAO;
import com.kpit.sample.pojos.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO dao;
	
	@Override
	public void saveStudent(Student student) {
		dao.save(student);		
	}

	@Override
	public Student getStudent(int id) {
		Optional<Student> op = dao.findById(id);
		return op.get();				
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) dao.findAll();
	}

	@Override
	public void removeStudent(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Student getByEmail(String email) {
		return dao.getByEmail(email);
	}

	@Override
	public List<Student> getStudentsLike(String name) {
		
		return dao.getStudentsLike(name);
	}
}
