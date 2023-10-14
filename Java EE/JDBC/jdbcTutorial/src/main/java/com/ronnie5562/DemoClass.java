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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String pass = ""; // REmember to add your database password before you run !!!
		String query = "SELECT first_name, last_name FROM actor WHERE actor_id < 20;";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		System.out.println(rs);

		String Fname = rs.getString("first_name");
		String Lname = rs.getString("last_name");
		
		System.out.println(Fname + " " + Lname);
		
		st.close();
		con.close();
		
	}
}
