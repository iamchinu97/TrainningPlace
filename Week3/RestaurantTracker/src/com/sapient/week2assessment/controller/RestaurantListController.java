package com.sapient.week2assessment.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.week2.assessment.bean.RestaurantBean;
import com.sapient.week2assessment.dao.RestaurantDAO;

/**
 * Servlet implementation class RestaurantListController
 */
public class RestaurantListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("RestaurantList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String entity_id=request.getParameter("entity_id");
		RestaurantDAO rd= new RestaurantDAO();
		List<RestaurantBean> resList;
		try {
			 resList=rd.getRestaurantsByCity(entity_id);
			RequestDispatcher rs= request.getRequestDispatcher("RestaurantList.jsp");
			request.setAttribute("result", resList);
			rs.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
