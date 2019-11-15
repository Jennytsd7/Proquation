package com.proquation.bean;
/** @author Rahul Suresh
*  version 1.0
*  This is a Java bean class for Teacher
*/
public abstract class Teacher {
    
    private String teacher_name;
    private String teacher_grade;
    private String teacher_username;
    
    public String getTeacherName() {
        return teacher_name;
    }
    public void setTeacherName(String teacher_name) {
        this.teacher_name = teacher_name;
    }
    public String getTeacherGrade() {
        return teacher_grade;
    }
    public void setTeacherGrade(String teacher_grade) {
        this.teacher_grade = teacher_grade;
    }
    public String getTeacherUsername() {
        return teacher_username;
    }
    public void setTeacherUsername(String teacher_username) {
        this.teacher_username = teacher_username;
    }
    
}