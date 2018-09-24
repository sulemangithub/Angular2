package com.kpit.sample.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	
	@SequenceGenerator(name="student_seq_generator",sequenceName="student_seq",allocationSize=1)
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="student_seq_generator")
	private int sid;
	private String sname;
	private String email;
	private LocalDate dob;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String email, LocalDate dob) {
		super();
		this.sname = sname;
		this.email = email;
		this.dob = dob;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
}
