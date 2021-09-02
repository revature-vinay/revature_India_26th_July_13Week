package com.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.app.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	//	Student s1=new Student(100, "Sachin", 23, "student@gmail.com", "Mumbai");
	//	session.save(s1);
//		Student s=(Student) session.get(Student.class, 100);
//		System.out.println(s);
//		s.setEmail("updatedemail@gmail.com");
//		session.update(s);
		
//		Student s=new  Student();
//		s.setId(100);
//		
//		session.delete(s);
		
//		Student s1=new Student("Kamala", 29, "kamala@gmail.com", "Gurgaon", 4434567899L);
//		
//		Student s2=new Student("Kamali", 25, "kamali@gmail.com", "Mumbai", 5534567899L);  //Transient
//		
//		System.out.println("Id Generated = "+session.save(s1));
//		session.save(s2); //Persistant
//		
//	
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		
		Query query=session.createQuery("from com.app.model.Student order by age");
		List<Student> studentList=query.list();
		for(Student s:studentList) {
			System.out.println(s);
		}
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.between("age", 20, 25));
		List<Student> studentList2=criteria.list();
		System.out.println(studentList2);
		
		
		transaction.commit();
		session.close();
		//s2.setEmail("somemail.com"); //Detached
		factory.close();
	}

}
