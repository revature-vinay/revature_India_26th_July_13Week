package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.app.model.Customer;
import com.app.model.Orders;

public class DemoMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Customer customer1=new Customer(100, "Dinesh");
//		Orders order1=new Orders("O0001", 12222.22);
//		order1.setCustomer(customer1);
//		
//		Customer customer2=new Customer(101, "Mahesh");
//		Orders order2=new Orders("O0002", 4444.44);
//		order2.setCustomer(customer2);
//		
//		
//		Orders order3=new Orders("O0003", 3232.44);
//		order3.setCustomer(customer1);
//		
//		Orders order4=new Orders("O0004", 9232.44);
//		order4.setCustomer(customer1);
//		
//		Orders order5=new Orders("O0005", 3232.44);
//		order5.setCustomer(customer2);
//		
//		customer1.getOrderList().add(order1);
//		customer1.getOrderList().add(order3);
//		customer1.getOrderList().add(order4);
//		
//		
//		customer2.getOrderList().add(order2);
//		customer2.getOrderList().add(order5);
//		
//		Customer customer3=new Customer(103, "Suresh");
//		session.save(customer1);
//		session.save(customer2);
//		session.save(customer3);
//		session.save(order1);
//		session.save(order2);
//		session.save(order3);
//		session.save(order4);
//		session.save(order5);
//		
		Query query =session.createQuery("from com.app.model.Customer");
		
		List<Customer> customerList=query.list();
		for (Iterator iterator = customerList.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();
			System.out.println(customer);
		}
		
		transaction.commit();
		session.close();

		factory.close();

	}

}
