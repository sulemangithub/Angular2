package com.kpit.sample.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private String email;
	private String password;
	private String name;
	private String city;
	private String phone;
	private String dob;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String email, String password, String name, String city, String phone, String dob) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.dob = dob;
	}

	public Customer(String email2, String password2) {
		this.email = email2;
		this.password = password2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", name=" + name + ", city=" + city + ", phone="
				+ phone + ", dob=" + dob + "]";
	}	
}
