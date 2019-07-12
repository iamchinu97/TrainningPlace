package com.sapient.week2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.week2.dao.StudentDAO;

/**
 * Servlet implementation class StudentInsertController
 */
public class StudentInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("AdminInsert.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username;
		String password;
		String firstname;
		String lastname;
		String marks;
		try {
			username=request.getParameter("username");
			password=request.getParameter("password");
			firstname=request.getParameter("firstname");
			lastname=request.getParameter("lastname");
			marks=request.getParameter("marks");
			StudentDAO sd= new StudentDAO();
			if(sd.insertStudentDetails(username, password, firstname, lastname, marks))
			{
				RequestDispatcher rs = request.getRequestDispatcher("AdminInsert.jsp");
				request.setAttribute("msg", "Student :"+username+" Added Successfully");
				rs.forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
