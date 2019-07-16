<%@page import="com.sapient.week2.assessment.bean.BookingsBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="RestaurantListController">Add More</a>

<%
List<BookingsBean> bookings=null;
if(request.getAttribute("bookings")!=null)
{
	bookings=(List<BookingsBean>)request.getAttribute("bookings");
%>
<table>
<tr>
<th>id</th>
<th>Restaurant Name</th>
<th>First name</th>
<th>last name</th>
<th>members</th>
</tr>
<%
	
	for(BookingsBean b: bookings)
	{
%>
<tr>
<td><%=b.getId()%></td>
<td><%=b.getName() %></td>
<td><%=b.getFirstname() %></td>
<td><%=b.getLastname() %></td>
<td><%=b.getMembers() %></td>
</tr>
<%
	}
%>
</table>
<%
}
%>
</body>
</html>