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

import com.proquation.bean.Teacher;
import com.proquation.bean.Student;
import com.proquation.dao.StudentsOfTeacherDAO;
import com.proquation.dao.TeacherLoginDAO;


// Author name: Rahul Suresh
@WebServlet("/studentofteacher")
public class StudentsOfTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StudentsOfTeacherController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> studentlist = new ArrayList<Student>();
		Teacher teacher = (Teacher) request.getSession().getAttribute("teacher");
		StudentsOfTeacherDAO studentobj = new StudentsOfTeacherDAO();
		studentlist = studentobj.GetStudentsOfTeacher(teacher.getTeacherGrade());
		request.setAttribute("studentlist", studentlist);
		request.getRequestDispatcher("studentList.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

