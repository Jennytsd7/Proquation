package com.proquation.controller;

/** @author Raghavan Sreenivasa
 *  version 1.0
 *  This is a controller class to handle student registration functionalities
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.dao.StudentRegistrationDAO;
import com.proquation.dao.StudentUsernameSearch;

@WebServlet("/studentregister")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("firstname");
		String username = request.getParameter("username");
		String grade = request.getParameter("grade");
		String password = request.getParameter("password");
		StudentUsernameSearch usernameSearch = new StudentUsernameSearch();
		boolean usernameNotExists = usernameSearch.CheckUsernameExists(username);
		if(usernameNotExists) {
			StudentRegistrationDAO studentRegistrationDao = new StudentRegistrationDAO();
			studentRegistrationDao.registerStudent(name, username, password, grade);
		}
		else{
			String message = "Enter a different username";
			request.setAttribute("errorMessage", message);
			request.getRequestDispatcher("studentRegistration.jsp").forward(request, response);
		}
			
		
		String message = "Student successfully added";
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("studentLogin.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
