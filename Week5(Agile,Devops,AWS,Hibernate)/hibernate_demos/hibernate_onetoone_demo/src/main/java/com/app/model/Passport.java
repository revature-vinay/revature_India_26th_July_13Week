package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Passport {

	@Id
	private String passportNumber;
	public Passport(String passportNumber, String country) {
		super();
		this.passportNumber = passportNumber;
		this.country = country;
	}

	private String country;
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", country=" + country + "]";
	}
	
	
}
