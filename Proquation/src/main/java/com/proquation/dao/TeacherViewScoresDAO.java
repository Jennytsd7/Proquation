package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.proquation.bean.Quiz;

//Author Name - Janani Anand

public class TeacherViewScoresDAO {
	public List<Quiz> viewScores(String grade) {
		List<Quiz> quizList = new ArrayList<Quiz>();
		String query = "SELECT * FROM proquation.quizdata where grade =?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, grade);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Quiz quiz = new Quiz();
				quiz.setStudentName(rs.getString("student_name"));
				quiz.setMarks(rs.getString("quiz_marks"));				
				if(quiz!= null)
					quizList.add(quiz);
			}
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
		return quizList;
	}
}
