package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddQuizDAO {
	public void AddQuiz(String quizData, int teacherID, String quizGrade) {
		String query = "insert into proquation.Quiz(quiz_data, teacher_id, quiz_grade) values(?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		JSONObject quizDataJson = null;
		JSONParser jsonparser = new JSONParser();
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			quizDataJson = (JSONObject) jsonparser.parse(quizData);
			statement = connection.prepareStatement(query);
			statement.setObject(1, quizDataJson);
			statement.setInt(2, teacherID);
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
