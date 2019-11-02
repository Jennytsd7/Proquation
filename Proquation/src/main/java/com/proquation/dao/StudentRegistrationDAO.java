package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//Author name: Rahul Suresh
public class StudentRegistrationDAO {
	public void registerStudent(String name, String username, String password, String grade){
		String query = "insert into Student (student_fullname, student_username, student_password, student_grade) values (?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1,name);
			statement.setString(2,username);
			statement.setString(3,password);
			statement.setString(4,grade);
			statement.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
