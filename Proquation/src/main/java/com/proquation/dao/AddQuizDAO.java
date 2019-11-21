package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public class AddQuizDAO {
	public void AddQuiz(String quizData, String teacherUsername, String quizGrade) {
		String query = "insert into proquation.Quiz(quiz_data, quiz_grade, teacher_username) values(?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
//		JSONObject quizDataJson = null;
//		JSONParser jsonparser = new JSONParser();
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			//quizData="{\"Questions\": {\"0\": {\"QuestionNumber\": \"1\",\"Question\": \"what\",\"Option1\": \"a\",\"Option2\": \"b\",\"Option3\": \"c\",\"Option4\": \"d\",\"CorrectAnswer\": \"d\"},\"1\": {\"QuestionNumber\": \"2\",\"Question\": \"how\",\"Option1\": \"a\",\"Option2\": \"b\",\"Option3\": \"c\",\"Option4\": \"d\",\"CorrectAnswer\": \"c\"}}}";
			//quizDataJson = (JSONObject) jsonparser.parse(quizData);
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
