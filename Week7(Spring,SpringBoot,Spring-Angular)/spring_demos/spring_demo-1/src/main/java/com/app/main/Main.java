package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Hello;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
//		Hello h1=context.getBean(Hello.class);
//		System.out.println(h1.getMessage());
		
		Hello h1=(Hello) context.getBean("h1");
		System.out.println(h1.getMessage());
		System.out.println("address of h1 is "+System.identityHashCode(h1));
		
		Hello h12=(Hello) context.getBean("h1");
		System.out.println(h12.getMessage());
		System.out.println("address of h12 for bean id h1 "+System.identityHashCode(h12));
		
		Hello h2=(Hello) context.getBean("h2");
		System.out.println(h2.getMessage());

	}

}
