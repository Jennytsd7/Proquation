package com.proquation.bean;

/** @author Raghavan Sreenivasa
 *  version 1.0
 *  This is a Java bean class for student belonging to grade 4 and higher
 */

public class StudentHighGrade implements Student {
    private String studentFullname;
    private String studentUsername;
    private String studentPassword;
    private String studentGrade;
    
    public String getStudentFullname() {
        return studentFullname;
    }
    public void setStudentFullname(String studentFullname) {
        this.studentFullname = studentFullname;
    }
    public String getStudentUsername() {
        return studentUsername;
    }
    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }
    public String getStudentPassword() {
        return studentPassword;
    }
    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
    public String getStudentGrade() {
        return studentGrade;
    }
    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }
}