package com.hibernate;

public class Student {

	private int rollNo;
	private String name;
	private String address;
	private Integer number;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, Integer number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}	
}