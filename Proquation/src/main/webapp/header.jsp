<!-- Author name: Raghavan Sreenivasa -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/header.css"/>
</head>
<<<<<<< Updated upstream
=======
<script type="text/javascript" src="/Proquation/js/header.js" charset="utf-8"></script>
<%
	if((String)request.getSession().getAttribute("username") == null) {
		boolean userFlag = false;
		String username = null;
		String userType = null;
		request.getSession().setAttribute("userFlag", userFlag);
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("userType", userType);
	}
%>
<%!
	public void setUsername(HttpServletRequest request, String username, boolean userFlag, String userType) {
		request.getSession().setAttribute("userFlag", userFlag);
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("userType", userType);
	}
%>
>>>>>>> Stashed changes
<body>
	<div class="header">
		<a href="/Proquation">
        	<img src="/Proquation/images/logo.jpg" alt="logo" class = "logo"/>
        	<h1 class="title">Proquation</h1>
        </a>
    </div>
</body>
</html>