package com.proquation.bean;

/** @author Raghavan Sreenivasa edited by Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for student belonging to grade 4 and higher
 */

public class StudentHighGrade extends Student {
    
    public String getHighGradeStudentFullname() {
        return this.getStudentName();
    }
    public void setHighGradeStudentFullname(String studentFullname) {
    	this.setStudentName(studentFullname);
    }
    public String getHighGradeStudentUsername() {
        return this.getStudentUsername();
    }
    public void setHighGradeStudentUsername(String studentUsername) {
        this.setStudentUsername(studentUsername);
    }
   
    public String getHighGradeStudentGrade() {
        return this.getStudentGrade();
    }
    public void setHighGradeStudentGrade(String studentGrade) {
    	this.setStudentGrade(studentGrade);
    }
}