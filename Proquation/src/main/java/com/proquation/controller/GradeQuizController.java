/* Author name: Raghavan
 * Version 1.0
 */
package com.proquation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.bean.Student;
import com.proquation.dao.AddQuizMarksDAO;

@WebServlet("/gradequiz")
public class GradeQuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GradeQuizController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student = (Student) request.getSession().getAttribute("student");
		String marks = request.getParameter("marks");
		System.out.println(marks);
		AddQuizMarksDAO addQuizDAO = new AddQuizMarksDAO(); 
		addQuizDAO.saveQuizMarks(student.getStudentName(), marks, student.getStudentGrade());
		request.getRequestDispatcher("studentLanding.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

