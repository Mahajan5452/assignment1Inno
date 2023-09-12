package com.assignment2;

public class Address {
	private int id;
	private int pincode;
	private String city;
	private int student_id;
	
	public Address(int id, int pincode, String city, int student_id) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.city = city;
		this.student_id = student_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	
}
