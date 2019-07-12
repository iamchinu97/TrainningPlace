<%@page import="java.util.Map"%>
<%@page import="com.sapient.week2.bean.StudentBean"%>
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
String msg="";
if(request.getAttribute("msg")!=null)
{
	msg=(String)request.getAttribute("msg");
}
%>
<a href='Admin.jsp'>Admin home</a>
<form action="StudentInsertController" method="post">
Enter username:<br>
<input type='text' name='username'><br>
Enter password:<br>
<input type='password' name='passowrd'><br>
Enter firstname<br>
<input type='text' name='firstname'><br>
Enter Lastname:<br>
<input type='text' name='lastname'><br>
Student's marks<br>
<input type='text' name='marks'><br>
<br>
<input type="submit" name='submit'>
</form>
<%=msg %>
</body>
</html>