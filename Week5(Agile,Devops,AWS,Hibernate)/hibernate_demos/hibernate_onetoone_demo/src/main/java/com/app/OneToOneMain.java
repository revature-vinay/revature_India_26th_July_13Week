package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.app.model.Passport;
import com.app.model.Person;

public class OneToOneMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
//		
//		Passport passport=new Passport("LGG9090", "Windies");
//		
//		Person person=new Person("Brian Lara", passport);
//		
//		session.save(passport);
//		session.save(person);
//		
		Person person = (Person) session.get(Person.class, 3);
		System.out.println(person);

		Criteria criteriaPerson = session.createCriteria(Person.class);
		Criteria criteriaPassport=criteriaPerson.createCriteria("passport");
		criteriaPassport.add(Restrictions.eq("country", "Windies"));
		List<Person> personList=criteriaPerson.list();
		
		//System.out.println(personList);
		for (Iterator iterator = personList.iterator(); iterator.hasNext();) {
			Person person2 = (Person) iterator.next();
			System.out.println(person2);
		}
		
		System.out.println("END of RESULT FOR PERSON With COuntry\n\n");
		
		Query query=session.createQuery("from com.app.model.Person");
		List<Person> personsList=query.list();
		
		for(Person p:personsList) {
			System.out.println(p.getName());
			if(p.getName().startsWith("C") || p.getName().endsWith("h")) {
				System.out.println("Passport details for "+p.getName()+" is : "+p.getPassport());
			}
		}

		transaction.commit();
		session.close();

		factory.close();

	}

}
