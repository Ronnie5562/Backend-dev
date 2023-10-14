package com.ronnie5562;
import java.sql.*;

/* ==> To successfully work with JDBC, you have to follow the seven steps below
 * 1. import the needed packages
 * 2. Load and Register the driver
 * 3. Create a connection.
 * 4. Create a statement
 * 5. Execute the query
 * 6. Process the result
 * 7. Close the connection 
 */

public class DemoClass {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection();
	}
}
