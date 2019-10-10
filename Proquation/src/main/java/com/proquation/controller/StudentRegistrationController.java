package com.proquation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.dao.StudentRegistrationDAO;

@WebServlet("/studentregister")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("firstname");
		String username = request.getParameter("username");
		String grade = request.getParameter("grade");
		String password = request.getParameter("password");
		StudentRegistrationDAO studentRegistrationDao = new StudentRegistrationDAO();
		studentRegistrationDao.registerStudent(name, password, username, grade);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
