package com.kpit.sample.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpit.sample.pojos.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{
	
	/*public void saveStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public void removeStudent(int id);
	*/
	@Query("select s from Student s where s.email = :email")
	public Student getByEmail(@Param("email") String email);
	
	
	@Query("select s from Student s where s.sname like :name")
	public List<Student> getStudentsLike(@Param("name") String name);	
	
}
