package com.sapient.week2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewStudentDetails
 */
public class ViewStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		final String query="select registration_no,firstname,lastname,marks from student"; 
		Connection conn;
		ResultSet result;
		try {
			conn = DBConnect.getConnection();
			PreparedStatement stmt=conn.prepareStatement(query);
			result=stmt.executeQuery();
			out.println("<html>"
					+ "<head>"
					+ "<title>Children Details</title>"
					+ "</head>"
					+ "<body>"
					+ "<table>"
					+ "<tr>"
					+ "<th>Username</th>"
					+ "<th>Firstname</th>"
					+ "<th>Lastname</th>"
					+ "<th>marks</th>"
					+ "<th>Edit</th>"
					+ "<th>Delete</th>"
					+ "</tr>");
			while(result.next())
			{
				
				out.println("<form method='post' action='ViewStudentDetails'");
				out.println("<tr>");
				out.println("<td>"+result.getString(1)+"</td>");
				out.println("<input type='hidden' name='username' value='"+result.getString(1)+"'>");
				out.println("<td><input type='text' name='firstname' value='"+result.getString(2)+"'></td>");
				out.println("<td><input type='text' name='lastname' value='"+result.getString(3)+"'></td>");
				out.println("<td><input type='number' name='marks' value='"+result.getString(4)+"'></td>");
				out.println("<td><input type='submit' name='submit' value='Edit'></td>");
				out.println("<td><input type='submit' name='submit' value='Delete'></td>");
				out.println("</tr>");
				out.println("</form>");
				
				
			}
			out.println("</table></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn;
		ResultSet result;
		try {
			conn=DBConnect.getConnection();
			if(request.getParameter("submit").toLowerCase().equals("edit"))
			{
				final String query="UPDATE student SET firstname=?,lastname=?,marks=? WHERE registration_no=?";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setString(1, request.getParameter("firstname"));
				stmt.setString(2, request.getParameter("lastname"));
				stmt.setString(3, request.getParameter("marks"));
				stmt.setString(4, request.getParameter("username"));
				result=stmt.executeQuery();
				System.out.println(result);
				doGet(request, response);
			}
			else if(request.getParameter("submit").toLowerCase().equals("delete"))
			{
				final String query="DELETE FROM student WHERE registration_no=?";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setString(4, request.getParameter("username"));
				result=stmt.executeQuery();
				doGet(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
