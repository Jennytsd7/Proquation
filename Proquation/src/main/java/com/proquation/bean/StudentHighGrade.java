package com.proquation.bean;
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