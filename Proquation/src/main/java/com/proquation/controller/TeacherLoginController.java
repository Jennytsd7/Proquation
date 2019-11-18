package com.proquation.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.bean.Teacher;
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
			String userType = (String) request.getSession().getAttribute("userType");
			if (userType != null) {
				if (userType.equals("Student")) {
					request.getSession().removeAttribute("Student");
				} else if (userType.equals("Teacher")) {
					request.getSession().removeAttribute("Teacher");
				}
			}
			request.getSession().setAttribute("teacher", teacher);
			request.getSession().setAttribute("username", teacher.getTeacherUsername());
			request.getSession().setAttribute("userFlag", true);
			request.getSession().setAttribute("userType", "Teacher");
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
