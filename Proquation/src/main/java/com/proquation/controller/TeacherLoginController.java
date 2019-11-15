package com.proquation.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.bean.Student;
import com.proquation.bean.Teacher;
import com.proquation.dao.StudentsOfTeacherDAO;
import com.proquation.dao.TeacherLoginDAO;

// Author name: Rahul Suresh
@WebServlet("/teacherlogin")
public class TeacherLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TeacherLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("firstname");
		String password = request.getParameter("password");
		String message;
		TeacherLoginDAO login = new TeacherLoginDAO();
		Teacher teacher = login.ValidateTeacher(username, password);
		if (teacher != null) {
			request.getSession().setAttribute("teacher", teacher);
			request.getSession().setAttribute("username", teacher.getTeacherUsername());
			request.getSession().setAttribute("userFlag", true);
			RequestDispatcher rd = request.getRequestDispatcher("teacherLanding.jsp");
			rd.forward(request, response);
		} else {
			message = "Login Failed!! Please check your crendentials";
			request.setAttribute("message", message);
			request.getRequestDispatcher("teacherLogin.jsp").forward(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
