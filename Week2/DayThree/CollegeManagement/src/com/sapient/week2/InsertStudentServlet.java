package com.sapient.week2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertStudentServlet
 */
public class InsertStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ "<head>"
				+ "<title>Insert student page</title>"
				+ "</head>"
				+ "<body>"
				+ "<a href='AdminServlet'>Go to home page</a>"
				+ "<form method='post' action='InsertStudentServlet'>"
				+ "Enter Username<br>"
				+ "<input type='text' name='username'><br>"
				+ "Enter Firstname:<br>"
				+ "<input type='text' name='firstname'><br>"
				+ "Enter Lastname:<br>"
				+ "<input type='text' name='lastname'><br>"
				+ "Enter Student marks out of 500:<br>"
				+ "<input type='number' name='marks'><br><br>"
				+ "<button type='submit'>Submit</button><br>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn;
		PrintWriter out=response.getWriter();
		final String createUser="insert into users values(?,?,?)";
		final String insertQuery="insert into student values(?,?,?,?)";
		try {
			conn = DBConnect.getConnection();
			PreparedStatement createstmt= (PreparedStatement) conn.prepareStatement(createUser);
			createstmt.setString(1, request.getParameter("username"));
			createstmt.setString(2, "123456");
			createstmt.setString(3, "student");
			createstmt.executeQuery();
			PreparedStatement stmt= (PreparedStatement) conn.prepareStatement(insertQuery);
			PreparedStatement commitstmt= (PreparedStatement) conn.prepareStatement("commit");
			stmt.setString(1, request.getParameter("username"));
			stmt.setString(2, request.getParameter("marks"));
			stmt.setString(3, request.getParameter("firstname"));
			stmt.setString(4, request.getParameter("lastname"));
			stmt.executeQuery();
			commitstmt.executeQuery();
			out.println("Student addedd successfully");
			doGet(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
