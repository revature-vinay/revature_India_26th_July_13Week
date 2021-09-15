package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_hibernate_beans.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

		// System.out.println(employeeDAO.addEmployee(new Employee("Gayathri", 22,
		// 12312.22, "Trainee")));
		System.out.println(employeeDAO.getAllEmployees());
	}

}
