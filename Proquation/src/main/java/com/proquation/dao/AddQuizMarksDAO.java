package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddQuizMarksDAO {
	public void saveQuizMarks(String studentName, String marks, String grade) {
		String query = "insert into QuizData (student_name, quiz_marks, grade) values (?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, studentName);
			statement.setString(2, marks);
			statement.setString(3, grade);
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
