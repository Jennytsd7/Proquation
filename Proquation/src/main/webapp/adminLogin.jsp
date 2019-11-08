<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Author name: Janani Anand
Co-author name: Rahul Suresh, Raghavan Sreenivasa -->
<meta charset="UTF-8">
<title>Admin Login Form</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css family=Lobster">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/studentLogin.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body class="bgimg">
	<div class="header">
		<img src="/Proquation/images/logo.jpg" alt="logo" class="logo" />
		<h1>Proquation</h1>
	</div>


	<div class="container">
		<form action="adminlogin" onsubmit="submitform()" method="post">
			<h3>ADMIN LOGIN</h3><br>
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