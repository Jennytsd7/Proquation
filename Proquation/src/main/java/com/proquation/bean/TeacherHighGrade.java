package com.proquation.bean;
/** @author Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for High level teacher
 */
public class TeacherHighGrade extends Teacher{

	public String getHighLevelTeacherFullname() {
		return this.getTeacherName();
	}

	public void setHighLevelTeacherFullname(String teacherFullname) {
		this.setTeacherName(teacherFullname);		
	}
	
	public String getHighLevelTeacherUsername() {
		return this.getTeacherUsername();
	}

	public void setHighLevelTeacherUsername(String teacherUsername) {
		this.setTeacherUsername(teacherUsername);		
	}

	public String getHighLevelTeacherGrade() {
		return this.getTeacherGrade();
	}

	public void setHighLevelTeacherGrade(String teacherGrade) {
		this.setTeacherGrade(teacherGrade);
		
	}
	

}
