package com.ronnie5562;

import java.sql.*;

public class InsertOperation {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String pass = ""; // Remember to add your database password before you run !!!
		String query = "INSERT INTO actor VALUES (202, 'Ronald', 'Abimbola', '2023-10-14 05:02:19');";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count + " Row(s) Affected");
		
		st.close();
		con.close();
	}
}
