<!-- 
	Author: Raghavan, Rahul Suresh
	Version: 1.0
 -->
<%@page import="java.util.Iterator"%>
<%@page import="com.proquation.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentList.css"/>
</head>
<body>
<div class="backbutton">
		<a href="teacherLanding.jsp">
		 <img src="/Proquation/images/backButton.png" alt="back"/>
		</a>
	</div>
<table>
	<tr>
		<th>Name</th>
		<th>Grade</th>
	</tr>
<%
	List<Student> studentlist = new ArrayList<Student>();
	studentlist = (ArrayList<Student>)request.getAttribute("studentlist");
	Iterator i = studentlist.listIterator();
	while(i.hasNext()) {
		Student nextStudent = (Student)i.next();
		%>
			<tr>
				<td><%=nextStudent.getStudentName()%></td>
				<td><%=nextStudent.getStudentGrade()%></td>
			</tr>
		<%
	}
%>
</table>
</body>
</html>