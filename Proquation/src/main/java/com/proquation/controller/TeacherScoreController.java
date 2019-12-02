/* Author name: Janani Anand
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
import com.proquation.bean.Teacher;
import com.proquation.dao.TeacherViewScoresDAO;

@WebServlet("/teacherViewScore")
public class TeacherScoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TeacherScoreController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Teacher teacher = (Teacher) request.getSession().getAttribute("teacher");
		TeacherViewScoresDAO teacherViewScoresDAO = new TeacherViewScoresDAO();
		List<Quiz> quizScoreList = teacherViewScoresDAO.viewScores(teacher.getTeacherGrade());
		request.setAttribute("quizScoreList", quizScoreList);
		request.getRequestDispatcher("teacherViewScore.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}