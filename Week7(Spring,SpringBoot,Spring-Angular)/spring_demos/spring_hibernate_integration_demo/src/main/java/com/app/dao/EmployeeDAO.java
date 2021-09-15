package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeDAO {

	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public void deleteEmployee(int id);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByName(String name);
	public List<Employee> getAllEmployeesByDesignation(String designation);
	public List<Employee> getAllEmployeesByAge(int age);
	public List<Employee> getAllEmployeesBySalary(double salary);
}
