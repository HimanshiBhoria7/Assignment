package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "productespire")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
    
	@NotNull
	@Column(name="productId")
	private int productId;
	@NotNull
	@Column(name="category")
	private String category;
	@NotNull
	@Column(name="description")
	private String description;
	@NotNull
	@Column(name="manufacturer")
	private String manufacturer; 
	@NotNull
	@Column(name="name")
	private String name;
	@NotNull
	@Column(name="price")
	private int price;
	@NotNull
	@Column(name="unit")
	private int unit;

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}

}