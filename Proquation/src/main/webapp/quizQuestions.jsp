<!-- 
	Author: Raghavan
	Version: 1.0
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="/header.jsp" %>	
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/Proquation/css/quizQuestions.css"/>

</head>
<body>
	<div class ="loadQuestions"></div>
	<form action ="" onSubmit=submitform() method="post">
		<label class="questionNumberLabel" for ="questionNumber">Question Number:</label> 
			<input type="text"
				class ="questionNumber" name="questionNumber" id="questionNumber"
				placeholder="Enter question number">
				
		<label class="questionLabel" for ="question">Question:</label> 
			<input type="text"
				class ="question" name="question" id="question"
				placeholder="Enter your question">
		<div class="optionContainer">		
			<label class="optionLabel" for="option1">Answer 1:</label> 
				<input type="text"
					class="options" name="option1" id="option1"
					placeholder="Enter option 1">
		</div>
		
		<div class="optionContainer">
			<label class="optionLabel" for="option2">Answer 2:</label> 
				<input type="text"
					class="options" name="option2" id="option2"
					placeholder="Enter option 2">
		</div>
		
		<div class="optionContainer">
			<label class="optionLabel" for="option3">Answer 3:</label> 
				<input type="text"
					class="options" name="option3" id="option3"
					placeholder="Enter option 3">
		</div>
		
		<div class="optionContainer">
			<label class="optionLabel" for="option4">Answer 4:</label> 
				<input type="text"
					class="options" name="option4" id="option4"
					placeholder="Enter option 4">
		</div>
		
		<input class="button" id="continue" type="submit" value="Continue">
		
		<input class="button" id="submit "type="submit" value="Submit">
			
	</form>
	
	<script type="text/javascript" src="/Proquation/js/quizQuestions.js" charset="utf-8"></script>

</body>
</html>