<%@page import="com.proquation.bean.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/adminLanding.css">
</head>
<body>
<%	Admin admin = (Admin) request.getSession().getAttribute("admin"); 
	String username = admin.getAdminUsername();
	boolean userFlag = true;
	request.getSession().removeAttribute("username");
	request.getSession().removeAttribute("userFlag");
	request.getSession().removeAttribute("userType");
	setUsername(request, username, userFlag, "Admin");
%>
	<div class="admin-landing-container">
		<section class="student-section">
			<h1>Register a Student</h1>
			<a href="/Proquation/studentRegistration.jsp">
				<img src="/Proquation/images/student-icon.png" alt="student"/>
			</a>
		</section>
		<section class="teacher-section">
			<h1>Register a Teacher</h1>
			<a href="/Proquation/teacherRegistration.jsp">
				<img src="/Proquation/images/teacher-icon.png" alt="teacher"/>
			</a>
		</section>
	</div>
</body>
</html>