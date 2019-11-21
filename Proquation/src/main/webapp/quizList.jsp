<!-- 
	Author: Rahul Suresh
	Version: 1.0
 -->
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz List</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/quizList.css"/>
</head>
<body>
<table>
	<tr>
		<th>Quiz List</th>
	</tr>
<%
	List<String> quizList = new ArrayList<String>();
	quizList = (ArrayList<String>)request.getAttribute("quizList");
	Iterator i = quizList.listIterator();
	int count=1;
	while(i.hasNext()) {
		String quiz = (String)i.next();
		%>
			<tr>
				<td><%="Quiz "+ count%></td>
			</tr>
		<%
		count++;
	}
%>
</table>
</body>
</html>