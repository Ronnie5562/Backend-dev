package com.ronnie5562.mvc.dao;

import java.sql.*;
import java.util.*;
import com.ronnie5562.mvc.model.Employee;

public class EmployeeDao {	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee (id, first_name, last_name, username, password, address, contact) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "Abimbola123");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			System.out.println("preparedStatement: " + preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public ResultSet fetchEmployees() {
		
		String FETCH_USERS_SQL = "SELECT * FROM employee";
		ResultSet result = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "Abimbola123");
			Statement statement = connection.createStatement();
			
			result = statement.executeQuery(FETCH_USERS_SQL);
		
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
}