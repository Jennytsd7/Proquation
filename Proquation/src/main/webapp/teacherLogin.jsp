<!-- Author name: Janani Anand
Co-author name: Rahul Suresh 
Version 1.0 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Login Form</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentLogin.css">

</head>
<body class="bgimg">
	<div class="container">
		<form action="teacherlogin" onsubmit="submitform()" method="post">
		<%
           String errorMessage = (String)request.getAttribute("errorMessage");
           if (errorMessage != null) {
           out.println(errorMessage);
       	}
       %>
			<h3>TEACHER LOGIN</h3><br>
			<div class="form">
				<label for="fname">USER NAME</label> <input type="text" id="fname"
					name="firstname" placeholder="Enter your username">
			</div>
			<div class="form">
				<label for="PASS">PASSWORD</label> <input type="password" id="PASS"
					name="password" placeholder="Enter your password">
			</div>
			<div class="form">
				<input class="form button" type="submit" name="submit"
					value="Submit">
			</div>
	</form>
	</div>
	
	<script type="text/javascript">
   function submitform(){
                        if((document.getElementById('fname').value.length==0) || (document.getElementById('lname').value.length==0) ||(document.getElementById('Grade').value.length==0) )
                            window.alert("Enter all details!");
                        else
                            window.alert("Welcome to Proquation!");
                    }
  </script>
</body>
</html>