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
import com.proquation.dao.RetrieveQuizDAO;


// Author name: Rahul Suresh
@WebServlet("/retrievequiz")
public class RetrieveQuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RetrieveQuizController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> quizList = new ArrayList<String>();
		RetrieveQuizDAO retrievequizObj = new RetrieveQuizDAO();
		if(request.getSession().getAttribute("student") != null) {
			Student student = (Student) request.getSession().getAttribute("student");
			quizList = retrievequizObj.GetQuizList(student.getStudentGrade());
			request.setAttribute("quizList", quizList);
			request.getRequestDispatcher("quizList.jsp").forward(request, response);
		}
		else if(request.getSession().getAttribute("teacher") != null) {
			Teacher teacher = (Teacher) request.getSession().getAttribute("teacher");
			quizList = retrievequizObj.GetQuizList(teacher.getTeacherGrade());
			request.setAttribute("quizList", quizList);
			request.getRequestDispatcher("quizListTeacher.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

