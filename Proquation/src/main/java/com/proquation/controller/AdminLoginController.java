package com.proquation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proquation.dao.AdminLoginDAO;
//Author name: Rahul Suresh
@WebServlet("/adminlogin")
public class AdminLoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
    public AdminLoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("firstname");
		String password = request.getParameter("password");
		String message;
		AdminLoginDAO login= new AdminLoginDAO();
		boolean isUserValid = login.ValidateAdmin(username, password);
		if(isUserValid) {			
			//for testing
			RequestDispatcher rd = request.getRequestDispatcher("teacherRegistration.jsp");
			rd.forward(request, response);
		}
		else
		{
			message = "Login Failed!! Please check your crendentials";
			request.setAttribute("message", message);
			response.sendRedirect("adminLogin.jsp");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
