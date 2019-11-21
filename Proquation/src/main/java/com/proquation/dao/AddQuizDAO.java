package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Author name: Rahul Suresh
public class AddQuizDAO {
	public void AddQuiz(String quizData, String teacherUsername, String quizGrade) {
		String query = "insert into proquation.Quiz(quiz_data, quiz_grade, teacher_username) values(?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setObject(1, quizData);
			statement.setString(2, teacherUsername);
			statement.setString(3, quizGrade);
			statement.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
