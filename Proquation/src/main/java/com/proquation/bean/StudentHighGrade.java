package com.proquation.bean;

/** @author Raghavan Sreenivasa edited by Rahul Suresh
 *  version 1.0
 *  This is a Java bean class for student belonging to grade 4 and higher
 */

public class StudentHighGrade extends Student {
    
    public String getStudentFullname() {
        return this.getStudent_name();
    }
    public void setStudentFullname(String studentFullname) {
    	this.setStudent_name(studentFullname);
    }
    public String getStudentUsername() {
        return this.getStudent_username();
    }
    public void setStudentUsername(String studentUsername) {
        this.setStudent_username(studentUsername);
    }
   
    public String getStudentGrade() {
        return this.getStudent_grade();
    }
    public void setStudentGrade(String studentGrade) {
    	this.setStudent_grade(studentGrade);
    }
}