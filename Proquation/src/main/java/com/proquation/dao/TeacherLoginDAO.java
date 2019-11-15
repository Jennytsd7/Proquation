package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//Author name: Rahul Suresh
public class TeacherLoginDAO {
	public boolean ValidateTeacher(String username, String password) {
		boolean flag = false;
		List<String> slist = new ArrayList<String>();
		StudentsOfTeacherDAO obj = new StudentsOfTeacherDAO();
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
				String grade = rs.getString("teacher_grade");
				slist =obj.GetStudentsOfTeacher(grade);
				if(dbPassword.equals(password))
				{
					flag=true;
				}
			}
			else
				flag = false;
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
		return flag;
	}

}
