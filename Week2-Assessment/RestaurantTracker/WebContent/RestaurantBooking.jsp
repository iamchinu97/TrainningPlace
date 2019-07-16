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
String id="";
if(request.getParameter("id")!=null)
{
	id=request.getParameter("id");
}
%>
<center>
<form action="BookRestaurantController" method="post">
<%=id %><br>
<input type="hidden" name="id" value="<%=id%>">
<input type="text" placeholder="Enter your Firstname" name="firstname"><br>
<input type="text" placeholder="Enter your lastname" name="lastname"><br>
<input type="text" placeholder="Number of members" name="members"><br><br>
<input type="submit" value="submit">
</center>
</form>
</body>
</html>