package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsOfTeacherDAO {

	public List<String> GetStudentsOfTeacher(String teacher_grade) {
		List<String> students = new ArrayList<String>();
		String names;
		String query = "SELECT student_fullname from Student where Student.student_grade=?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, teacher_grade);
			ResultSet rs = statement.executeQuery();
			if (rs.next())
			{
				while (rs.next()) {
					names = rs.getString("student_fullname");
					students.add(names);
				}
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
		return students;
	}
}
