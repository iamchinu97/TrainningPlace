package com.sapient.week2.controller;

import com.sapient.week2.bean.UserBean;
import com.sapient.week2.bundle.ReBundle;
import com.sapient.week2.dao.*;
import com.sapient.week2.exceptions.RecordNotFoundException;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentLoginController
 */
public class UserLoginController extends HttpServlet {
    private static final String MESSAGE_DIGEST_TECHNIQUE = "MD5";
    private static final String PARAM_PASSWORD = "password";
    private static final String PARAM_USERNAME = "username";
    private static final String SERVER_ERROR_SERVLET = "ServerErrorServlet";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    ServletContext studentContext;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	studentContext= config.getServletContext();
    	try {
			studentContext.setAttribute("userList", new LoginDAO().getUserDetails());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	super.init(config);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	private String getStringHashMD5(String str) throws NoSuchAlgorithmException {
        MessageDigest m = MessageDigest.getInstance(MESSAGE_DIGEST_TECHNIQUE);
        m.update(str.getBytes(), 0, str.length());
        return new BigInteger(1, m.digest()).toString(16);
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	String username="";
    	String password="";
        try {
            username = request.getParameter(PARAM_USERNAME);
            password = request.getParameter(PARAM_PASSWORD);
            System.out.println(username + password);
            UserBean ub=((Map<String, UserBean>)studentContext.getAttribute("userList")).get(username);
            System.out.println(ub.getPassword());
            if(ub==null)
            {
            	throw new RecordNotFoundException(ReBundle.getValueUser("USER_RECORD_NOT_FOUND"));
            }
            String hashedPassword = getStringHashMD5(password);
            boolean passwordMatch = hashedPassword.hashCode()==ub.getPassword().hashCode();
            if(passwordMatch) {
            	if(ub.getRole().toLowerCase().equals("admin"))
            	{
            		RequestDispatcher rs=request.getRequestDispatcher("Admin.jsp");
            		request.setAttribute("userDetails", ub);
        			rs.forward(request, response);
            	}
            	else if(ub.getRole().toLowerCase().equals("student"))
            	{
            		RequestDispatcher rs=request.getRequestDispatcher("Student.jsp");
            		request.getSession().setAttribute("username", ub.getUsername());
        			rs.forward(request, response);
            	}
            	
            } else {
            	throw new RecordNotFoundException(ReBundle.getValueUser("USER_RECORD_NOT_FOUND"));
            	
            }
        }catch(RecordNotFoundException e) {
        	RequestDispatcher rs=request.getRequestDispatcher("index.jsp");
    		request.setAttribute("LOGIN_ERROR",e.getMessage());
			rs.forward(request, response);
            
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            response.sendRedirect(SERVER_ERROR_SERVLET);
        }
    }

}
