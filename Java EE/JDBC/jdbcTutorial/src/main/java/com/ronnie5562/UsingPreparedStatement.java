package com.ronnie5562;

import java.sql.*;

public class UsingPreparedStatement {
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		int rollNo = 203;
		String firstName = "Sharon";
		String lastName = "Abimbola";
		String lastUpdated = "2023-10-14 05:02:19";
		String pass = ""; // Remember to add your database password before you run !!!
		String query = "INSERT INTO actor VALUES (?, ?, ?, ?);";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, rollNo);
		st.setString(2, firstName);
		st.setString(3, lastName);
		st.setString(4, lastUpdated);
		
		
		int count = st.executeUpdate();
		
		System.out.println(count + " Row(s) Affected");
		
		st.close();
		con.close();
	}
}
