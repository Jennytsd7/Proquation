package com.proquation.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.bean.Teacher;
import com.proquation.dao.AddQuizDAO;

//Author name: Rahul Suresh

@WebServlet("/addquiz")
public class AddQuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddQuizController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Teacher teacherObj = (Teacher) request.getSession().getAttribute("teacher");
		String grade = teacherObj.getTeacherGrade();
		String teacherUsername = teacherObj.getTeacherUsername();
		AddQuizDAO addquizObj = new AddQuizDAO();
		String quizData = request.getParameter("questions");
		addquizObj.AddQuiz(quizData, grade, teacherUsername);
		String message = "Quiz successfully added";
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("teacherLanding.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}