package com.kpit.sample.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	private double price;
	private String category;
	private LocalDate mDate;
	private LocalDate eDate;
	private String imagePath;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double price, String category, LocalDate mDate, LocalDate eDate,
			String imagePath) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.mDate = mDate;
		this.eDate = eDate;
		this.imagePath = imagePath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getmDate() {
		return mDate;
	}

	public void setmDate(LocalDate mDate) {
		this.mDate = mDate;
	}

	public LocalDate geteDate() {
		return eDate;
	}

	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", mDate="
				+ mDate + ", eDate=" + eDate + ", imagePath=" + imagePath + "]";
	}
}
