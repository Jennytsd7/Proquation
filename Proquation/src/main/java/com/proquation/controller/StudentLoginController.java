package com.proquation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proquation.dao.StudentLogin;


@WebServlet("/studentlogin")
public class StudentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentLoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message;
		StudentLogin login= new StudentLogin();
		boolean isUserValid = login.ValidateUser(username, password);
		if(isUserValid) {			
			response.sendRedirect("student-home.jsp");
		}
		else
		{
			message = "Login Failed!! Please check your crendentials";
			request.setAttribute("message", message);
			response.sendRedirect("student-login.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("student-registeres.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
