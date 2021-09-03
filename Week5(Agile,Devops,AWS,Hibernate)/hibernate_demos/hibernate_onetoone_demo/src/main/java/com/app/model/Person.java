package com.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passportNumber")
	private Passport passport;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person( String name, Passport passport) {
		super();
		
		this.name = name;
		this.passport = passport;
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
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
	
	
}
