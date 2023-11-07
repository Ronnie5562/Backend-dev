package com.ronnie5562.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age, Address address) {}; // Just a java class that has constructors, getters and setters, and toString() automatically created. It was introduced to reduce verbosity.
record Address (String firstLine, String City) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ronald";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Navin", 98, new Address("Baker Street", "London"));
	}
	
	@Bean(name = "my_address") // To change the name of a  bean from the initial method name.
	@Primary
	public Address address() {
		return new Address("Imam Shuaib street, Ayobo", "Lagos");
	}
	
	@Bean
	@Qualifier("demoaddress")
	public Address address2() {
		return new Address("Somewhere", "Kigali");
	}
	// One other cool thing we can do with spring beans is that, we can create a new bean using existing beans and get their outputs to the new bean using a concept called Auto-wiring.
	// Check it out below !!!
	
	@Bean
	public Person ronald(String name, int age, Address my_address) {
		return new Person(name, age, my_address);
	}
	
	@Bean
	public Person demoPerson(String name, int age, @Qualifier("demoaddress") Address addr) {
		return new Person("", 1, addr);
	}
}
