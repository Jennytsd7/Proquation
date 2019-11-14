package com.proquation.bean;
/** @author Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for student
 */
public abstract class Student {


	private int student_id;
	private String student_name;
	private String student_username;
	private String student_grade;

	public int getStudentId() {
		return student_id;
	}
	public void setStudentId(int student_id) {
		this.student_id = student_id;
	}
	public String getStudentName() {
		return student_name;
	}
	public void setStudentName(String student_name) {
		this.student_name = student_name;
	}
	public String getStudentUsername() {
		return student_username;
	}
	public void setStudentUsername(String student_username) {
		this.student_username = student_username;
	}
	public String getStudentGrade() {
		return student_grade;
	}
	public void setStudentGrade(String student_grade) {
		this.student_grade = student_grade;
	}


}


