package com.sapient.week2assessment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.week2.assessment.bean.BookingsBean;
import com.sapient.week2.assessment.bean.RestaurantBean;
import com.sapient.week2assessment.dao.BookingsDAO;
import com.sapient.week2assessment.dao.RestaurantDAO;

/**
 * Servlet implementation class BookRestaurantController
 */
public class BookRestaurantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookRestaurantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("BookingList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		System.out.println("id in post="+id);
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String members=request.getParameter("members");
		RestaurantBean rb=RestaurantDAO.resList.get(id);
		System.out.println(rb);
		BookingsDAO bd = new BookingsDAO();
		bd.bookRestaurant(id, rb.getName(), firstname, lastname, members);
		RequestDispatcher rs= request.getRequestDispatcher("BookingList.jsp");
		request.setAttribute("bookings", BookingsDAO.bookings);
		rs.forward(request, response);
		
	}

}
