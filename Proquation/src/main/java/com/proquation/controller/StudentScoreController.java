/* Author name: Swarnalatha Srenigarajan
 * Version 1.0
 */
package com.proquation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proquation.bean.Quiz;
import com.proquation.bean.Student;
import com.proquation.dao.StudentViewScoresDAO;

@WebServlet("/studentViewScore")
public class StudentScoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StudentScoreController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student student = (Student) request.getSession().getAttribute("student");
		StudentViewScoresDAO studentViewScoresDAO = new StudentViewScoresDAO();
		List<Quiz> quizScoreList = studentViewScoresDAO.viewScores(student.getStudentName());
		request.setAttribute("quizScoreList", quizScoreList);
		request.getRequestDispatcher("studentViewScore.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}