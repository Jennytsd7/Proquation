package com.proquation.bean;

/** @author Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for student belonging to grade 1 - 3
 */

public class StudentLowGrade extends Student {

	public String getLowGradeStudentFullname() {
		return this.getStudentName();
	}
	public void setLowGradeStudentFullname(String studentFullname) {
		this.setStudentName(studentFullname);
	}
	public String getLowGradeStudentUsername() {
		return this.getStudentUsername();
	}
	public void setLowGradeStudentUsername(String studentUsername) {
		this.setStudentUsername(studentUsername);    
	}

	public String getLowGradeStudentGrade() {
		return this.getStudentGrade();
	}
	public void setLowGradeStudentGrade(String studentGrade) {
		this.setStudentGrade(studentGrade);	
	}
		
	
}