
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Author name: Swarnalatha Srenigarajan -->
<!-- Co-Author name: Janani Anand -->
<!-- version: 1.1 -->
<%@page import="com.proquation.bean.Student"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Landing Page</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentLanding.css">
</head>
<body>

<%Student student = (Student) request.getSession().getAttribute("student");
	String grade = student.getStudentGrade(); 
	request.setAttribute("student", student);	
%>
	<div class="student-landing-container">	
		<section class="student-quiz-section">
			<h1>Quiz Mode</h1>
			<h2>Student should attempt a quiz to test his/her knowledge</h2>
			<a href="takeQuiz.jsp">
				<img src="/Proquation/images/quiz-img.png" alt="student"/>
			</a>
		</section>
		
		<section class="student-practice-section">
			<h1>Student Practice Mode</h1>
			<h2> Student can solve questions to practice concepts</h2>
			<a href="studentViewPractice.jsp">
				<img src="/Proquation/images/practice-img.jpg" alt="student"/>
			</a>
		</section>
	</div>
</body>
</html> 
