package com.proquation.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.proquation.bean.Student;
import com.proquation.bean.StudentHighGrade;
import com.proquation.bean.StudentLowGrade;
public class StudentLoginDAO {
	//Author : Rahul Suresh, Raghavan Sreenivasa

	public Student ValidateStudent(String username, String password) {
		//        boolean flag = false;
		String query = "select * from Student where student_username=?";
		Connection connection = null;
		PreparedStatement statement = null;
		Student student = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			if(rs.next())
			{
				String dbPassword = rs.getString("student_password");
				if(dbPassword.equals(password))
				{
					if(rs.getString("student_grade") == "1")
						student = new StudentLowGrade();
					else
						student = new StudentHighGrade();											
					student.setStudentFullname(rs.getString("student_fullname"));
					student.setStudentUsername(rs.getString("student_Username"));
					student.setStudentGrade(rs.getString("student_grade"));
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
		return student;
	}

}