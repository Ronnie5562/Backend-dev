package com.ronnie5562.mvc.model;

import java.util.*;

public class EmployeeService {
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(001, "Steve", "Rogers"),
				new Employee(002, "Tony", "Stark"),
				new Employee(003, "Thor", "Odinson"),
				new Employee(004, "Carol", "Danvers"),
				new Employee(005, "T'Challa", ""));
	}
}
