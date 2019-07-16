package com.sapient.week2assessment.dao;

import java.util.List;

import com.sapient.week2.assessment.bean.BookingsBean;

public class BookingsDAO {
	public static List<BookingsBean> bookings;
	public void bookRestaurant(String id,String name,String firstname,String lastname,String members)
	{
		BookingsBean bb= new BookingsBean(id, name, firstname, lastname, members);
		bookings.add(bb);
	}

}
