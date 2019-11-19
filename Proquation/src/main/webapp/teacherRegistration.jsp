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
<title>Teacher Registration</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentLogin.css">
</head>
<body class="bgimg">
	<div align="center">
		<div class="container" align="center">

			<form action="teacherregister" onsubmit="submitform()" method="post">
				<h4>TEACHER REGISTRATION FORM</h4>
				<div>
					<label for="name">NAME</label> <input type="text" id="fname"
						name="firstname" placeholder="Your first name">
				</div>

				<div class="form">
					<label for="Class">CLASS</label> <select id="Class" name="grade">
						<option value="1">1-3</option>
						<option value="4">4-6</option>
					</select></br>
				</div>

				<label for="uname">USERNAME</label> <input type="text" id="uname"
					name="username" placeholder="Your username"> <label
					for="PASS">PASSWORD</label> <input type="password" id="PASS"
					name="password" placeholder="Enter your password"> <label
					for="PASS1">RE-ENTER PASSWORD</label> <input type="password"
					id="PASS1" name="PASS1" placeholder="Enter your password again">
				<input class="form button" type="submit" name="submit"
					value="Register">
			</form>
		</div>
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