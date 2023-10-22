package com.starboy.usermananagement.dao;

import java.sql.*;
import java.util.*;

import com.starboy.usermananagement.model.User;

public class UserDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/java_db?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Abimbola123";
	
	private static final String INSERT_USERS_SQL = "INSERT INTO users" + " (name, email, country) VALUES " + " (?, ?, ?);";
	private static final String SELECT_USER_BY_ID = "SELECT id, name, email, country from users where id = ?;";
	private static final String SELECT_ALL_USERS = "SELECT * FROM users;";
	private static final String DELETE_USERS_SQL = "DELETE FROM users where id = ?;";
	private static final String UPDATE_USERS_SQL = "UPDATE users set name = ?, email = ?, country = ?, where id = ?;";
	
	protected Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			
		} catch (SQLException err) {
			err.printStackTrace();
			
		} catch (ClassNotFoundException err) {
			err.printStackTrace();
			
		}
		
		return connection;
	}
	
	
	// create or insert user
	public void insertUser(User user) throws SQLException{
		try (
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)
		){
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getCounrtry());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// update user
	public boolean updatetUser(User user) throws SQLException{
		boolean rowUpdated = false;
		try (
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)
		){
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getCounrtry());
			preparedStatement.setInt(4, user.getId());
			
			rowUpdated = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
	
	
	// select user by id
	public User selectUser(int id) throws SQLException {
		User user = null;
		
		try (
				Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)
		){
			preparedStatement.setInt(1, id);
			
			System.out.println(preparedStatement);
			ResultSet result = preparedStatement.executeQuery();
			
			while (result.next()) {
				String name = result.getString("name");
				String email = result.getString("email");
				String country = result.getString("country");
				
				user = new User(id, name, email, country);
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
		return user;
	}
	
	
	// select all users
	public List<User> selectAllUsers() throws SQLException {
		List<User> users = new ArrayList<>();
		
		try (
				Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)
		){
			
			System.out.println(preparedStatement);
			ResultSet result = preparedStatement.executeQuery();
			
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				String country = result.getString("country");
				
				users.add(new User(id, name, email, country));
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
		return users;
	}
	
	
	// delete user
	public boolean deleteUser(int id) throws SQLException{
		boolean rowDeleted = false;
		try (
				Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)
		){
			preparedStatement.setInt(1, id);
			rowDeleted = preparedStatement.executeUpdate() > 0;
					
		} catch (Exception err) {
			err.printStackTrace();
		}
		return rowDeleted;
	}
	
	

}
