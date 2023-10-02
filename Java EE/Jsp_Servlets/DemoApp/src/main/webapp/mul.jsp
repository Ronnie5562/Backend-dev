<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		// This section is known as declaration section
	%>

	<%
		int value = 10 / 0;
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