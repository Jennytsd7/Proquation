package com.proquation.controller;

/** @author Swarnalatha Sreenigarajan, Raghavan Sreenivasa
 *  version 1.0
 *  This is a controller class to handle student login functionalities
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proquation.bean.Student;
import com.proquation.dao.StudentLoginDAO;
@WebServlet("/studentlogin")
public class StudentLoginController extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
   public StudentLoginController() {
       super();
   }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username = request.getParameter("firstname");
        String password = request.getParameter("password");
        String message;
        StudentLoginDAO login= new StudentLoginDAO();
        Student student = login.ValidateStudent(username, password);
       if(student != null) {
           request.getSession().setAttribute("student", student);
           request.getSession().setAttribute("username", username);
           request.getSession().setAttribute("userFlag", true);
           RequestDispatcher rd = request.getRequestDispatcher("studentLanding.jsp");
           rd.forward(request, response);
        }
        else
        {
           message = "Login Failed!! Please check your crendentials";
           request.setAttribute("errorMessage", message);
           request.getRequestDispatcher("studentLogin.jsp").forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}