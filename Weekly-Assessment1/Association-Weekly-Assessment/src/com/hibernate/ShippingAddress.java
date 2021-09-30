
package com.hibernate;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table(name = "shippingespire")

public class ShippingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	// Pojo
	@NotNull
	@Column(name="shippingId")
	private int shippingId;
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


	public int getShippingId() {
		return shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
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
