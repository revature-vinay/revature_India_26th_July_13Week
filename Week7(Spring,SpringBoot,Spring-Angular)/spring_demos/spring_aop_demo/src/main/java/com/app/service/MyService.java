package com.app.service;

public class MyService {
public MyService() {
	// TODO Auto-generated constructor stub
}
	public void validateUserName(String username) {
		System.out.println("Some validation logic to validate username");
	}

	public void validatePassword(String password) {
		System.out.println("Some validation logic to validate password");
	}

	public void validate1() {
		System.out.println("validate1() method");
	}

	public void validate2()  {
		System.out.println("validate2() method");
		
	}
	
	public void transact() {
		System.out.println("transact method from Myservice");
	}
	
	public String hello(String name) {
		return "Hello "+name.toUpperCase();
	}
	
	public void testException(int val)throws Exception{
		if(val<18) {
			throw new ArithmeticException("Value shoulde be greater than 18");
		}
		System.out.println("testExxception() was executed suuccessfully");
	}

}
