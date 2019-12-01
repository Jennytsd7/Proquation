<!-- Author name: Raghavan Sreenivasa
Co-author name: Janani Anand, Swarnalatha Sreenigarajan -->
<%@page import="com.proquation.bean.Student"%>
<%@include file="/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/Proquation/css/studentViewPractice.css">
</head>
<%Student student = (Student) request.getSession().getAttribute("student");
	String grade = student.getStudentGrade(); %>
<body class="student-practice-body">
	<div class="backbutton">
		<a href="studentLanding.jsp">
		 <img src="/Proquation/images/backButton.png" alt="back"/>
		</a>
	</div>
	<div class="button-panel">
		<div class="container">
			<!-- <div class="section"> -->
				<div class="button_heading">Digits</div>
				<div class="button-row">
					<div class="tile-wrapper">
						<button type="button" id="num_1" class="btn btn-primary btn-lg tile" value="1"
							draggable="true">1</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_2" class="btn btn-primary btn-lg tile" value="2"
							draggable="true">2</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_3" class="btn btn-primary btn-lg tile" value="3"
							draggable="true">3</button>
					</div>
				</div>
				<div class="button-row">
					<div class="tile-wrapper">
						<button type="button" id="num_4" class="btn btn-primary btn-lg tile" value="4"
							draggable="true">4</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_5" class="btn btn-primary btn-lg tile" value="5"
							draggable="true">5</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_6" class="btn btn-primary btn-lg tile" value="6"
							draggable="true">6</button>
					</div>
				</div>
				<div class="button-row">
					<div class="tile-wrapper">
						<button type="button" id="num_7" class="btn btn-primary btn-lg tile" value="7"
							draggable="true">7</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_8" class="btn btn-primary btn-lg tile" value="8"
							draggable="true">8</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="num_9" class="btn btn-primary btn-lg tile" value="9"
							draggable="true">9</button>
					</div>
				</div>
				<div class="button-row center">
					<div class="tile-wrapper">
						<button type="button" id="num_0" class="btn btn-primary btn-lg tile" value="0"
							draggable="true">0</button>
					</div>
				</div>
			<div class="section">
			</div>
			<!-- </div> -->
			<div class="section">
				<div class="button_heading">Operators</div>
				<div class="button-row">
					<div class="tile-wrapper">
						<button type="button" id="plus_op" class="btn btn-danger btn-lg tile" value="+"
							draggable="true">+</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="minus_op" class="btn btn-danger btn-lg tile" value="-"
							draggable="true">-</button>
					</div>
					<%
						if(grade.equalsIgnoreCase("4")) {
					%>
					<div class="tile-wrapper">
						<button type="button" id="multiply_op" class="btn btn-danger btn-lg tile" value="*"
							draggable="true">*</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="div_op" class="btn btn-danger btn-lg tile" value="/"
							draggable="true">/</button>
					</div>
					<%} %>
				</div>
			</div>
			<% 
	 			if(grade.equalsIgnoreCase("4")) {
	 		%>
			<div class="section">
				<div class="button_heading">Special Symbols</div>
				<div class="button-row text-center">
					<div class="tile-wrapper">
						<button type="button" id="left_paren" class="btn btn-success btn-lg tile" value="("
							draggable="true">(</button>
					</div>
					<div class="tile-wrapper">
						<button type="button" id="right_paren" class="btn btn-success btn-lg tile" value=")"
							draggable="true">)</button>
					</div>
				</div>
			</div>
			<%}%>
		</div>
	</div>

	<div class="sandbox-result">
		<div class="sandbox">
			<h2 class="sandbox-heading">Sandbox</h2>
			<div class="dragButtons"></div>
			<button type="button" class="btn btn-danger clearButton">Clear</button>
			<button type="button" class="btn btn-danger deleteButton">Delete</button>
		</div>
		<div class="result">
			<div class="result_heading">Result</div>
			<div class="result_content"></div>
		</div>
	</div>

	<script type="text/javascript" src="/Proquation/js/buttonClickevent.js" charset="utf-8"></script>
	<script type="text/javascript" src="/Proquation/js/dragButtons.js" charset="utf-8"></script>
	<script type="text/javascript" src="/Proquation/js/expressionEvaluator.js" charset="utf-8"></script>
	<script type="text/javascript" src="/Proquation/js/clearButton.js" charset="utf-8"></script>
</body>
</html>