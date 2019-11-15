<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/Proquation/css/quizQuestions.css"/>

</head>
<body>
	<div class ="loadQuestions"></div>
	<form action ="ProfessorController" method="post">
		<div class ="form-group">
			<label for ="q1">Question:</label> <input type="text"
				class ="form-control" name="question" id="q1"
				placeholder="Enter your question">
		</div>
		<div class="form-group">
			<label for="a1">Answer 1:</label> <input type="text"
				class="form-control" name="option1" id="a1"
				placeholder="Enter option 1">
		</div>
		<div class="form-group">
			<label for="a2">Answer 2:</label> <input type="text"
				class="form-control" name="option2" id="a2"
				placeholder="Enter option 2">
		</div>
		<div class="form-group">
			<label for="a3">Answer 3:</label> <input type="text"
				class="form-control" name="option3" id="a3"
				placeholder="Enter  option 3">
		</div>
		<div class="form-group">
			<label for="a4">Answer 4:</label> <input type="text"
				class="form-control" name="option4" id="a4"
				placeholder="Enter option 4">
		</div>
		<div class="form-group">
			<label for="a5">Correct Answer:</label> <input type="text"
				class="form-control" name="correctanswer" id="a5"
				placeholder="Enter correct answer">
		</div>
			<input type="hidden" name="action" value="Continue"> <input
				class="btn btn-primary" type="submit" name="Continue"
				value="Continue" button value="Refresh Page" onClick="window.location.reload();">
			
			<input type="hidden" name="action" value="Submit"> <input
				class="btn btn-primary" type="submit" name="Submit"
				value="Submit">
		</div>
	</form>

</body>
</html>