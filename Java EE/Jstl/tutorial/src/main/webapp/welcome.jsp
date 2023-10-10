<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		if (session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<h1>
		WELCOME PAGE
	</h1>
</body>
</html>