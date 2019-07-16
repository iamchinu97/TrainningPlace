<%@page import="java.util.List"%>
<%@page import="com.sapient.week2.assessment.bean.RestaurantBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<RestaurantBean> result=null;
if(request.getAttribute("result")!=null)
{
	result=(List<RestaurantBean>)request.getAttribute("result");
}
%>
<center>
<form action="RestaurantListController" method="post">
<select name="entity_id">
<option>Select City</option>

<option value=1>Delhi</option>
<option value=2>Calcutta</option>
<option value=3>Mumbai</option>
<option value=4>Banglore</option>
<option value=5>Pune</option>
</select>
<input type="submit" value="Get Restaurants">
</form>
<br>
<table border="1">

<%
if(result!=null)
{
	%>
	
	<tr>
	<th>id</th>
	<th>Name</th>
	<th>Location</th>
	<th>timing</th>
	<th>cuisines</th>
	<th>price range</th>
	<th>Rating out of 5</th>
	<th>Bookings</th>
</tr>
<%
for(RestaurantBean rb : result)
{
%>
<tr>
	<td><%= rb.getId() %></td>
	<td><%= rb.getName() %></td>
	<td><%= rb.getLocation() %></td>
	<td><%= rb.getTiming() %></td>
	<td><%= rb.getCuisines() %></td>
	<td><%= rb.getPrice_range() %></td>
	<td><%= rb.getRating() %></td>
	<td><a href="RestaurantBooking.jsp?id=<%=rb.getId()%>"><input type="submit" value="Book"></a></td>
</tr>
<%}}
else{
	System.out.println("No data");
}
%>
</table>
</center>
</body>
</html>