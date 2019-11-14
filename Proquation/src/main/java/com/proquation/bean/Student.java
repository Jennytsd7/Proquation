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

	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_grade() {
		return student_grade;
	}
	public void setStudent_grade(String student_grade) {
		this.student_grade = student_grade;
	}


}


