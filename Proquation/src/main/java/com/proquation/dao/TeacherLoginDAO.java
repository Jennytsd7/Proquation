package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.proquation.bean.StudentHighGrade;
import com.proquation.bean.StudentLowGrade;
import com.proquation.bean.Teacher;
import com.proquation.bean.TeacherHighGrade;
import com.proquation.bean.TeacherLowGrade;
//Author name: Rahul Suresh
public class TeacherLoginDAO {
	public Teacher ValidateTeacher(String username, String password) {
		Teacher teacher= null;
		String query = "select * from Teacher where teacher_username=?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			if(rs.next())
			{
				String dbPassword= rs.getString("teacher_password");
				if(dbPassword.equals(password))
				{
					if(rs.getString("teacher_grade") == "1")
						teacher = new TeacherLowGrade();
					else
						teacher = new TeacherHighGrade();											
					teacher.setTeacherName(rs.getString("teacher_fullname"));
					teacher.setTeacherGrade(rs.getString("teacher_grade"));
					teacher.setTeacherUsername(rs.getString("teacher_username"));
				}
			}

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
		return teacher;
	}

}
