<%@page import="com.sapient.week2.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result Section</title>
</head>
<body>
<%

StudentBean sb = new StudentBean();

if(request.getAttribute("studentDetails")!=null){
	sb=(StudentBean)request.getAttribute("studentDetails");
}
%>
<a href='UserLogoutController'>Logout</a>
<table>
<tr>
<th>Roll number</th>
<th>first name</th>
<th>last name</th>
<th>Marks</th>
</tr>
<tr>
<td><%=sb.getRegistartionId()%></td>
<td><%=sb.getFirstName()%></td>
<td><%= sb.getLastName()%></td>
<td><%=sb.getMarks()%></td>
</tr>
</table>
</body>
</html>