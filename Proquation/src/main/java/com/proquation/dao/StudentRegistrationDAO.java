package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRegistrationDAO {
	public void registerStudent(String name, String password, String username, String grade){
		String query = "insert into student values(?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance();
			statement = connection.prepareStatement(query);
			statement.setString(1,name);
			statement.setString(2,password);
			statement.setString(3,username);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
