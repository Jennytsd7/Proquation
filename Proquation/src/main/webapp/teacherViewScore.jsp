<!-- Author name: Janani Anand
Version 1.0 -->
<%@page import="java.util.Iterator"%>
<%@page import="com.proquation.bean.Quiz"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Scores</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/quizList.css"/>
</head>
<body>
	<div class="backbutton">
		<a href="teacherLanding.jsp">
		 <img src="/Proquation/images/backButton.png" alt="back"/>
		</a>
	</div>
	<table>
	<tr>
		<th>Student Name</th>
		<th>Marks</th>
	</tr>
<%
	List<Quiz> quizScoreList = new ArrayList<Quiz>();
	quizScoreList = (ArrayList<Quiz>)request.getAttribute("quizScoreList");
	Iterator i = quizScoreList.listIterator();
	while(i.hasNext()) {
		Quiz quiz = (Quiz)i.next();
		%>
			<tr>
				<td><%=quiz.getStudentName() %></td>
				<td><%=quiz.getMarks() %></td>
			</tr>
		<%
	}
%>
</table>
</body>
</html>