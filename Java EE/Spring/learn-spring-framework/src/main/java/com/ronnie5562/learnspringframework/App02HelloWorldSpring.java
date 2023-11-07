package com.ronnie5562.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("my_address"));
		
		System.out.println(context.getBean("ronald"));
		
		System.out.println(context.getBean("demoPerson"));
		
		// You can also use a class to get a bean. if more than one method of the specified class is present in the spring container you will get an error, except you use the @Primary annotation to specify the method(bean) that should be given preference.
		System.out.println(context.getBean(Person.class));
		
	}
}