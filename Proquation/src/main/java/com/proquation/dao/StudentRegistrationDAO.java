package com.proquation.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRegistrationDAO {
	public void registerStudent(String name, String password, String username, String grade){
		String query = "insert into student values('"+name+"','"+password+"','"+username+"','"+grade+"')";
		Connection connection = null;
		Statement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance();
			statement = connection.createStatement();
			statement.execute(query);
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
