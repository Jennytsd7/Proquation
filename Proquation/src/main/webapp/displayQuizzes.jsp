<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Author name: Janani Anand -->
<!-- version: 1-->
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<HTML>
    <HEAD>
        <TITLE>Quiz List Display</TITLE>
    </HEAD>

    <BODY>
    	 <% 
        if(request.getParameter("buttonName") != null) {
               session.setAttribute("status", "guest");
        }
    	%>

    <FORM NAME="form1" METHOD="POST">
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="QUIZ 1" ONCLICK="button1()">
    </FORM>
    <FORM NAME="form2" METHOD="POST">
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="QUIZ 2" ONCLICK="button2()">
    </FORM>
    <FORM NAME="form3" METHOD="POST">
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="QUIZ 3" ONCLICK="button3()">
    </FORM>
    <FORM NAME="form4" METHOD="POST">
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="QUIZ 4" ONCLICK="button4()">
    </FORM>
    <FORM NAME="form5" METHOD="POST">
        <INPUT TYPE="HIDDEN" NAME="buttonName">
        <INPUT TYPE="BUTTON" VALUE="QUIZ 5" ONCLICK="button5()">
    </FORM>
    </BODY>
    
</HTML>
   
