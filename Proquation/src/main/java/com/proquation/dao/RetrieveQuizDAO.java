package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Author : Rahul Suresh

public class RetrieveQuizDAO {

	public List<String> GetQuizList(String student_grade) {
		List<String> quizList = new ArrayList<String>();
		String query = "SELECT quiz_data FROM proquation.Quiz where quiz_grade =?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, student_grade);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String quiz = rs.getString("quiz_data");
				System.out.println(quiz);
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
