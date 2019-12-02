<!-- Author name: Janani Anand, Raghavan
Version 1.0
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Student Quiz Questions</title>
<link rel="stylesheet" type="text/css" href="/Proquation/css/loadQuizData.css"/>
</head>

<body>
<form class ="loadQuestions" action="gradequiz" onsubmit="submitQuiz()" method="post">
	<input id="marks" name="marks" value="" type="hidden">
	
<!--  For displaying the Question and Question number -->
	<p class="questionNumber" id="questionNumber"></p>	
	<p class="question" id="question"></p>
	
	<div class="radioContainer">
		<input type="radio" id="option1" class="options" name="options" value="">
  		<label class="optionLabel" id="option1label" for="option1"></label>
  	</div>
  	<div class="radioContainer">
  		<input type="radio" id="option2" class="options" name="options" value="">
  		<label class="optionLabel" id="option2label" for="option2"></label>
  	</div>
  	<div class="radioContainer">
  		<input type="radio" id="option3" class="options" name="options" value="">
  		<label class="optionLabel" id="option3label" for="option3"></label>
  	</div>
  	<div class="radioContainer">
  		<input type="radio" id="option4" class="options" name="options" value="">
  		<label class="optionLabel" id="option4label" for="option4"></label>
  	</div>

	<input type="button" class="button" id="next" value="Next">
		
	<input class="button" id="submit" type="submit" value="Submit">

</form>
</body>
<script type="text/javascript" src="/Proquation/js/loadQuizData.js" charset="utf-8"></script>
</html>

