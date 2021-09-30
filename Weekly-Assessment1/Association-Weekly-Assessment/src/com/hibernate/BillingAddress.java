package com.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;



@Entity
@Table(name = "billingespire")



public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="billingid")
	private int billingId;
	@NotNull
	@Column(name="address")
	private String address;
	@NotNull
	@Column(name="city")
	private String city;
	@NotNull
	@Column(name="state")
	private String state;
	@NotNull
	@Column(name="country")
	private String country;
	@NotNull
	@Column(name="zipcode")
	private int zipcode;
	@NotNull
	@Column(name="price")
	private int price;

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBillingId() {
		return billingId;
	}
	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
