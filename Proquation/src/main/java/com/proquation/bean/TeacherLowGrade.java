package com.proquation.bean;
/** @author Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for Low level teacher
 */
public class TeacherLowGrade extends Teacher{

	public String getLowLevelTeacherFullname() {
		return this.getTeacherName();
	}

	public void setLowLevelTeacherFullname(String teacherFullname) {
		this.setTeacherName(teacherFullname);		
	}
	
	public String getLowLevelTeacherUsername() {
		return this.getTeacherUsername();
	}

	public void setLowLevelTeacherUsername(String teacherUsername) {
		this.setTeacherUsername(teacherUsername);		
	}

	public String getLowLevelTeacherGrade() {
		return this.getTeacherGrade();
	}

	public void setLowLevelTeacherGrade(String teacherGrade) {
		this.setTeacherGrade(teacherGrade);
		
	}
	

}
