package com.app.model;

public class User {

	private int userId;
	private String fname;
	private String lname;
	private String email;
	private String gradutation;
	private int yop;
	private String university;
	private String certification;
	private int validity;
	private int version;
	private String provider;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGradutation() {
		return gradutation;
	}

	public void setGradutation(String gradutation) {
		this.gradutation = gradutation;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "User [userId=" + System.identityHashCode(this) + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", gradutation=" + gradutation + ", yop=" + yop + ", university=" + university + ", certification="
				+ certification + ", validity=" + validity + ", version=" + version + ", provider=" + provider + "]";
	}
	
	
}
