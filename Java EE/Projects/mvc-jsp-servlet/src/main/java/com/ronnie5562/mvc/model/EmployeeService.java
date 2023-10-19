package com.ronnie5562.mvc.model;

import java.sql.*;
import java.util.*;

import com.ronnie5562.mvc.dao.EmployeeDao;

public class EmployeeService {
	public List<Employee> getEmployees() {
		EmployeeDao employeedao = new EmployeeDao();
		ResultSet rs = employeedao.fetchEmployees();
		
		
		List<Employee> list = new ArrayList<Employee>();
	
		
		try {
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String Fname = rs.getString("first_name");
				String Lname = rs.getString("last_name");
				
				list.add(new Employee(id, Fname, Lname));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}