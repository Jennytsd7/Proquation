<!-- Author name: Raghavan Sreenivasa 
Version 1.0
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Landing Page</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/teacherLanding.css">
</head>
<body>
	<div class="teacher-landing-container">
		<section class="teacher-quiz-section">
			<h1>Post Quiz</h1>
			<a href="postQuiz.jsp">
				<img src="/Proquation/images/quiz-img.png" alt="student"/>
			</a>
		</section>
		<section class="teacher-view-student-section">
			<h1>View Students in Class</h1>
			<a href="viewStudents.jsp">
				<img src="/Proquation/images/student-list.jpg" alt="student"/>
			</a>
		</section>
		
	</div>
</body>
</html>