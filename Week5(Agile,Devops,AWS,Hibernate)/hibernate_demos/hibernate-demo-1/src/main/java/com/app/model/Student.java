package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id //used for making a column as Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)  //auto generate
	private int id;
	@Column(length = 50,nullable = false, name = "student_name")
	private String name;
	private int age;
	private String email;
	private String city;
	private long contact;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student( String name, int age, String email, String city,long contact) {
		super();
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
		this.contact=contact;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + "]";
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
