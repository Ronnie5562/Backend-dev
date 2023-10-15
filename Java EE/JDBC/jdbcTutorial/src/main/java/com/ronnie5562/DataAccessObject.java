package com.ronnie5562;
import java.sql.*;


class Actor
{
	String first_name;
	int id;
}

class ActorDAO
{
	public Actor getActor(int id)
	{
		String query = "SELECT * FROM actor WHERE actor_id=" + id;
		Actor AC = new Actor();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
			 Statement St = conn.createStatement();
			 ResultSet rs = St.executeQuery(query);
			 rs.next();
			 
			 AC.first_name = rs.getString("first_name");
			 AC.id = rs.getInt("actor_id");
			 
			 return AC;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

public class DataAccessObject {
	public static void main(String[] args)
	{
		ActorDAO dao = new ActorDAO();
		Actor A1 = dao.getActor(5);
		System.out.println(A1.id + " : " + A1.first_name);
	}

}
