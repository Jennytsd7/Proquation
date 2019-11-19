package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proquation.bean.Student;
import com.proquation.bean.StudentHighGrade;
import com.proquation.bean.StudentLowGrade;

public class StudentsOfTeacherDAO {

	public List<Student> GetStudentsOfTeacher(String teacher_grade) {
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		String query = "SELECT * from Student where Student.student_grade=?";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, teacher_grade);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String grade = rs.getString("student_grade");
				if(grade.equals("1")){
					student = new StudentLowGrade();	
				}
				else{
					student = new StudentHighGrade();						
				}
				student.setStudentGrade(rs.getString("student_grade"));
				student.setStudentId(rs.getInt("student_id"));
				student.setStudentName(rs.getString("student_fullname"));
				student.setStudentUsername(rs.getString("student_username"));
				students.add(student);
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
