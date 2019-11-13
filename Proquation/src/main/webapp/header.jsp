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
<%
	if((String)request.getSession().getAttribute("username") == null) {
		boolean userFlag = false;
		String username = null;
		request.getSession().setAttribute("userFlag", userFlag);
		request.getSession().setAttribute("username", username);
	}
%>
<%!
	public void setSession(HttpServletRequest request, String username, boolean userFlag) {
		request.getSession().setAttribute("userFlag", userFlag);
		request.getSession().setAttribute("username", username);
	}

%>
<body>
	<div class="header">
		<div class="header-logo">
			<a href="/Proquation">
        		<img src="/Proquation/images/logo.jpg" alt="logo" class = "logo"/>
        		<h1 class="title">Proquation</h1>
        	</a>
        </div>
        <%
        	if(((Boolean)session.getAttribute("userFlag")).booleanValue()) {
        %>
        <div class="header-logout">
        	<div class="header-name"></div>
        	<a href="">Logout</a>
        </div>
        <%
        	}
        %>
    </div>
</body>
</html>