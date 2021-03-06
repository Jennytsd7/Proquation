<!-- Author name: Swarnalatha Sreenigarajan
Co-author name: Raghavan Sreenivasa -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@include file="/header.jsp" %>
<html>
<head>
	<link rel="stylesheet" type="text/css"
	href="/Proquation/css/homepage.css"/>
</head>
<body>
	<div class="homepage-container">
		<section class="student-section">
			<h1>Student</h1>
			<%
				if(((Boolean)session.getAttribute("userFlag")).booleanValue() && request.getSession().getAttribute("userType").equals("Student")) {
					%>
					<a href="studentLanding.jsp">
			<%
				}
				else {
					%>
			<a href="studentLogin.jsp">
			<%
				}
			%>
				<img src="/Proquation/images/student-icon.png" alt="student"/>
			</a>
		</section>
		<section class="teacher-section">
			<h1>Teacher</h1>
			<%
				if(((Boolean)session.getAttribute("userFlag")).booleanValue() && request.getSession().getAttribute("userType").equals("Teacher")) {
					%>
					<a href="teacherLanding.jsp">
			<%
				}
				else {
					%>
			<a href="teacherLogin.jsp">
			<%
				}
			%>
				<img src="/Proquation/images/teacher-icon.png" alt="teacher"/>
			</a>
		</section>
		<section class="admin-section">
			<h1>Admin</h1>
			<%
				if(((Boolean)session.getAttribute("userFlag")).booleanValue() && request.getSession().getAttribute("userType").equals("Admin")) {
					%>
					<a href="adminLanding.jsp">
			<%
				}
				else {
					%>
			<a href="adminLogin.jsp">
			<%
				}
			%>
				<img src="/Proquation/images/admin-icon.png" alt="admin"/>
			</a>
		</section>
	</div>
</body>
</html>