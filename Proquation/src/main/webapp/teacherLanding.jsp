<!-- Author name: Raghavan Sreenivasa
   Co- Authors: Rahul Suresh, Janani Anand
Version 1.0
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<%@page import="com.proquation.bean.Teacher"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Landing Page</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/teacherLanding.css">
</head>
<body>
<%Teacher teacher = (Teacher)request.getSession().getAttribute("teacher"); 
	String username = teacher.getTeacherUsername();
	boolean userFlag = true;
	request.getSession().removeAttribute("username");
	request.getSession().removeAttribute("userFlag");
	request.getSession().removeAttribute("userType");
	setUsername(request, username, userFlag, "Teacher");
%>
	<div class="teacher-landing-container">
		<section class="teacher-quiz-section">
			<h1>Post Quiz</h1>
			<a href="/Proquation/quizQuestions.jsp">
				<img src="/Proquation/images/quiz-img.png" alt="teacher"/>
			</a>
		</section>
		<section class="teacher-view-student-section">
			<h1>View Students in Class</h1>
			<a href="/Proquation/studentofteacher">
				<img src="/Proquation/images/student-list.jpg" alt="teacher"/>
			</a>
		</section>
		<section class="student-quiz-section">
			<h1>View Scores</h1>
			<a href="/Proquation/teacherViewScore">
				<img src="/Proquation/images/quiz-score.jpg" alt="teacher"/>
			</a>
		</section>
	</div>
</body>
</html>