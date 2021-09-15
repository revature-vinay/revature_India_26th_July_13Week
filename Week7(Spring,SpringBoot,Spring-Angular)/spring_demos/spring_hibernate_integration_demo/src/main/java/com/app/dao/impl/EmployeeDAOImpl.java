package com.app.dao.impl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	public Session getSession() {
	//	Session session=sessionFactory.openSession();
//		if(session==null) {
//			session=sessionFactory.openSession();
//		}
		return session=sessionFactory.openSession();
	}
	@Override
	public Employee addEmployee(Employee employee) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=(Employee) session.get(Employee.class, id);
		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setId(id);
		session.delete(employee);
		transaction.commit();
		session.close();
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return getSession().createQuery("from com.app.model.Employee").list();
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesByDesignation(String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesBySalary(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

}
