package com.ronnie5562.mvc.model;

import java.util.*;

public class EmployeeService {
	public List<Employee> getEmployees() {
		return Arrays.asList(new Employee(001, "Ronnie", "Starboy"),
				new Employee(002, "Tony", "Stark"),
				new Employee(003, "Tom", "Cruise"),
				new Employee(004, "T'chala", "Panther"));
	}
}