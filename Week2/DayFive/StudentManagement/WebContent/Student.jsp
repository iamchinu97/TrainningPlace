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
String msg = "";
if(request.getAttribute("msg")!=null){
	msg=(String)request.getAttribute("msg");
}
%>
<a href='UserLogoutController'>Logout</a>
<h1>Student Result Section</h1>
<form action="StudentMarksController" method='post'>
<input type='text' name='rollno'><br><br>
<input type='submit' value='submit'>
<br>
<%=msg%>
</form>
</body>
</html>