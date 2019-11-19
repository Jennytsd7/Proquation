<!-- Author name: Raghavan Sreenivasa -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<%removeSessionUser(request, response); %>
<%!
	public void removeSessionUser(HttpServletRequest request, HttpServletResponse response) {
		if((String)request.getSession().getAttribute("username") != null) {
			request.getSession().removeAttribute("username");
			request.getSession().removeAttribute("userFlag");
			String userType = (String)request.getSession().getAttribute("userType");
			if(userType.equals("Student")) {
				request.getSession().removeAttribute("Student");
			}
			else if(userType.equals("Teacher")) {
				request.getSession().removeAttribute("Teacher");
			}
			else if(userType.equals("Admin")) {
				request.getSession().removeAttribute("Admin");
			}
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