<%@page import="com.sapient.week2.bean.*"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    Map<String, StudentBean> studentMap = (Map<String, StudentBean>)config.getServletContext().getAttribute("studentList");
%>
Admin - Edit Student Details:
<table>
<%
    for(StudentBean sb : studentMap.values()){
%>
<tr>
<td><%=sb.getRegistartionId()%></td><td><%=sb.getFirstName()%></td><td><%=sb.getLastName()%></td><td><%=sb.getMarks()%></td>
<td><a href=Edit.jsp?regNo=<%=sb.getRegistartionId()%>&firstName=<%=sb.getFirstName()%>&lastName=<%=sb.getLastName()%>&marks=<%=sb.getMarks()%>>Edit</a></td>
<td><a href=Delete.jsp?regNo=<%=sb.getRegistartionId()%>&firstName=<%=sb.getFirstName()%>&lastName=<%=sb.getLastName()%>&marks=<%=sb.getMarks()%>>Delete</a></td>
</tr>
<%}%>
</table>
</body>
</html>