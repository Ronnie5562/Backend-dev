<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<style>
	body {
		padding: 30px;
	}
</style>
</head>
<body bgcolor="cyan">

	<%@ page import="java.util.*" %>

	<%!
		// This section is known as declaration
		int value = 10;
	%>

	<%
		// This section is known as scriptlet
		
		// We get the request and response objects automatically in jsp
		int firstNum = Integer.parseInt(request.getParameter("jspnum1"));
		int secondNum = Integer.parseInt(request.getParameter("jspnum2"));
		
		int result = firstNum * secondNum;
		
		// We also get the out object automatically.
		
		out.println("Result: " + result);
	%>
	
	<br>

	<%= value %>

</body>
</html>