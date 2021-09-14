package com.app.model;

public class Address {
	
	private int aid;
	private String street;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + "]";
	}
	
	

}
