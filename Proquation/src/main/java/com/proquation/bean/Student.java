package com.proquation.bean;

/** @author Raghavan Sreenivasa
 *  version 1.0
 *  This is a Java bean class for student
 */

public interface Student {
    public String getStudentFullname();
    public void setStudentFullname(String studentFullname);
    public String getStudentUsername();
    public void setStudentUsername(String studentUsername);
    public String getStudentPassword();
    public void setStudentPassword(String studentPassword);
    public String getStudentGrade();
    public void setStudentGrade(String studentGrade);
}