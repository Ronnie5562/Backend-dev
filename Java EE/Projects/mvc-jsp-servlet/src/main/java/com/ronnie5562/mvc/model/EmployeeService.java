package com.ronnie5562.mvc.model;

import java.sql.*;
import java.util.*;
import com.ronnie5562.mvc.dao.EmployeeDao;

public class EmployeeService {
	public ArrayList<Employee> getEmployees() {
		EmployeeDao employeedao = new EmployeeDao();
		ResultSet data = null;
		ArrayList<Employee> list = new ArrayList<Employee>();	
		
		try {
			data = employeedao.fetchEmployees();
			
			while(data.next())
			{
				int id = data.getInt("id");
				String Fname = data.getString("first_name");
				String Lname = data.getString("last_name");
				
				list.add(new Employee(id, Fname, Lname));
			}
			
			return list;
			
		} catch (SQLException err) {
			err.printStackTrace();
			
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return list;
	}
}