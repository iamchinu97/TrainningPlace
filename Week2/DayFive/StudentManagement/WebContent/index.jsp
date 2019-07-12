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
	if(request.getParameter("LOGIN_ERROR")!=null)
	{
		msg=request.getParameter("LOGIN_ERROR");
	}
%>
<form action="UserLoginController" method='post'>
<input type='text' name='username'><br><br>
<input type='password' name='password'><br><br>
<input type='submit' value='submit'>
<%=msg %>
<br>
</form>
</body>
</html>