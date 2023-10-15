package com.ronnie5562;
import java.sql.*;


class Actor
{
	String first_name;
	String last_name;
	String last_updated;
	int id;
}

class ActorDAO
{
	Connection conn = null;
	
	public void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password"); // Remember put your db actual password
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Actor getActor(int id)
	{
		String query = "SELECT * FROM actor WHERE actor_id=" + id;
		Actor AC = new Actor();
		
		try {
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
	
	public int createActor(Actor AC)
	{
		String query = "INSERT INTO actor VALUES (?, ?, ?, ?)";

		
		try {
			PreparedStatement St = conn.prepareStatement(query);
			St.setInt(1, AC.id);
			St.setString(2, AC.first_name);
			St.setString(3, AC.last_name);
			St.setString(4, AC.last_updated);
			
			int count = St.executeUpdate();
			
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}
}

public class DataAccessObject {
	public static void main(String[] args)
	{
		ActorDAO dao = new ActorDAO();
		dao.connect();
		
		Actor A1 = dao.getActor(5);
		System.out.println(A1.id + " : " + A1.first_name);
		
		
		Actor A2 = new Actor();
		A2.id = 204;
		A2.first_name = "Richard";
		A2.last_name = "Abimbola";
		A2.last_updated = " 2023-10-15 07:25:50";
		int numAdded = dao.createActor(A2);
		System.out.println(numAdded + " Actor(s) Added");
	}

}
