<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" type="text/css"
	href="/Proquation/css/header.css"/>
</head>
<body>
<%removeSessionUser(request, response); %>
<%!
	public void removeSessionUser(HttpServletRequest request, HttpServletResponse response) {
		if((String)request.getSession().getAttribute("username") != null) {
			request.getSession().removeAttribute("username");
			request.getSession().removeAttribute("userFlag");
		}
		try {
			request.getRequestDispatcher("index.jsp").forward(request, response);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
%>
</body>
</html>